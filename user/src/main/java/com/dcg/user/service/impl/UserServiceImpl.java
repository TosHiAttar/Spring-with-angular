package com.dcg.user.service.impl;

import com.dcg.user.model.User;
import com.dcg.user.repository.UserRepo;
import com.dcg.user.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Service;

import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Setter
    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> getUserList() {
        return (List<User>) userRepo.findAll();
    }

    @Override
     public void addUser(User user) {
      userRepo.save(user);
    }

}
