package com.mycode.locality.usermanagement.model;

import lombok.Data;

@Data
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String street;
    private String city;
    private String country;
    private String pinCode;
    private String landmark;
}
