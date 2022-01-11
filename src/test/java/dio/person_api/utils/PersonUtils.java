package dio.person_api.utils;

import java.time.LocalDate;
import java.util.Collections;

import dio.person_api.dto.request.PersonDTO;
import dio.person_api.entities.Person;

public class PersonUtils {

    private static final String FIRST_NAME = "Teste";
    private static final String LAST_NAME = "Sobrenome";
    private static final String CPF_NUMBER = "996.474.050-65";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2001, 1, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("1998-05-03")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
