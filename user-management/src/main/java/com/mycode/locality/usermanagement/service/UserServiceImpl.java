package com.mycode.locality.usermanagement.service;

import com.mycode.locality.usermanagement.model.User;

public class UserServiceImpl implements UserService {

    @Override
    public User create(User user) {
        // ToDo validate all user info
        //ToDo verify  user exist based on email or verificationId or mobile number
        return null;
    }

    @Override
    public User modify(User user) {
        //ToDo verify any change is there. If yes, then update
        //ToDO Update in version table also
        return null;
    }

    @Override
    public User remove(User user) {
        //ToDo Verify user is present, if present remove all the records
        return null;
    }
}
