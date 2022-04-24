package com.service;

import com.model.User;

public interface UserService {

    public User createUser(User user);
    public User getUser(String userId);
    public User updateUser(User user);
    public Integer deleteUser(String userId);
}
