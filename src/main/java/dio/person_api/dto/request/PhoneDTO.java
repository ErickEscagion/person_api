package dio.person_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import dio.person_api.enums.PhoneType;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    @Schema(description = "ID auto generate")
    private Long id;

    @Schema(description = "type based on an Enum (HOME, MOBILE, COMMERCIAL)", example = "MOBILE")
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @Schema(description = "Phone Number", example = "(15)99818-1242")
    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}