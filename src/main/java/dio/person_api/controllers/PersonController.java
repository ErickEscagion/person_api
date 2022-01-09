package dio.person_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    @GetMapping
    @Operation(summary = "GET Person", description = "Route to see all registered person", tags = "Person")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "success doing GET Person"),
    })
    public String listAll() {
        return "teste API";
    }

}
