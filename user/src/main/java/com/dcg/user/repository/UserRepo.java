package com.dcg.user.repository;

import com.dcg.user.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.query.Procedure;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Table;


@Repository

@CrossOrigin(origins = "http://localhost:4200")
public interface UserRepo extends JpaRepository<User , Integer>{

    @Procedure(name = "prock")
    Table prock(@Param("uid") Integer id, @Param("uname") String name, @Param("uemail") String email, @Param("mob_number") Long number );




}
