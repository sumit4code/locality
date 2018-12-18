package com.mycode.locality.usermanagement.model;

import lombok.Data;

@Data
public class Contact {

    private String countryCode;
    private String contactNumber;
    private ContactType contactType;
}
