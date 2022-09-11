package com.bootcamp.dto.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisteredSellerDto {
    Long id;
    String firstName;
    String middleName;
    String lastName;
    String username;
    Boolean isActive;
    String companyName;
    String companyContact;
}
