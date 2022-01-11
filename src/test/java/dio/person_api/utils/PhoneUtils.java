package dio.person_api.utils;

import dio.person_api.dto.request.PhoneDTO;
import dio.person_api.entities.Phone;
import dio.person_api.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(15)98765-4321";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
