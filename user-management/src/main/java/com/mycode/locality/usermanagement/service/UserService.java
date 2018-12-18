package com.mycode.locality.usermanagement.service;

import com.mycode.locality.usermanagement.model.User;

public interface UserService {

    User create(User user);

    User modify(User user);

    User remove(User user);
}
