package dio.person_api.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.person_api.dto.mapper.PersonMapper;
import dio.person_api.dto.request.PersonDTO;
import dio.person_api.dto.response.MessageResponseDTO;
import dio.person_api.entities.Person;
import dio.person_api.exception.PersonNotFoundException;
import dio.person_api.repositories.PersonRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ",
                savedPerson.getId());

        return messageResponse;
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
        return personMapper.toDTO(person);
    }

    public void delete(Long id) throws PersonNotFoundException {
        personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
        personRepository.deleteById(id);
    }

}
