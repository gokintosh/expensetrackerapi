package com.gokul.expencetrackerapi.repositories;

import com.gokul.expencetrackerapi.domain.User;
import com.gokul.expencetrackerapi.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName,String lastName,String email,String password) throws EtAuthException;

    User findByEmailAndPassword(String email,String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);


}
