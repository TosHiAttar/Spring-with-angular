package com.dcg.user.service;

import com.dcg.user.model.User;



import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface UserService {
    List<User> getUserList();


    void addUser(User user);



}
