package dio.person_api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dio.person_api.dto.request.PersonDTO;
import dio.person_api.entities.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
