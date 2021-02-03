package com.gokul.expencetrackerapi.Service;

import com.gokul.expencetrackerapi.domain.User;
import com.gokul.expencetrackerapi.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email,String password) throws EtAuthException;

    User registerUser(String firstName,String lastName,String email,String password) throws EtAuthException;
}
