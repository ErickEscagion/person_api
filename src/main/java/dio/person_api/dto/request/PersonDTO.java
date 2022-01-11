package dio.person_api.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @Schema(description = "ID auto generate")
    private Long id;

    @Schema(description = "Fist Name", example = "Erick")
    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @Schema(description = "Last Name", example = "Escagion")
    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @Schema(description = "CPF", example = "484.220.208-40")
    @NotEmpty
    @CPF
    private String cpf;

    @Schema(description = "Birth Date", example = "2000-06-08")
    @NotNull
    private String birthDate;

    @Schema(description = "Phone(s)")
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
