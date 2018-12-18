package com.mycode.locality.usermanagement.model;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private Date dob;
    private boolean verificationDone;
    private ZonedDateTime createdOn;
    private ZonedDateTime modifiedOn;
    private String createdBy;
    private String modifiedBy;
    private List<Address> adresses;
    private List<Contact> contacts;
    private EmailDetail emailDetail;
    private boolean active;
}
