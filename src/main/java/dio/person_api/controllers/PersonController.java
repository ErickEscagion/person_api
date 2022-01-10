package dio.person_api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import dio.person_api.dto.request.PersonDTO;
import dio.person_api.dto.response.MessageResponseDTO;
import dio.person_api.services.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;

    @PostMapping
    @Operation(summary = "POST Person", description = "Route to post person", tags = "Person")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Created Person"),
    })
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping
    @Operation(summary = "GET Person", description = "Route to see all registered person", tags = "Person")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "success doing GET Person"),
    })
    public String listAll() {
        return "teste API";
    }

}
