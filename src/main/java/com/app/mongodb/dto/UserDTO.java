package com.app.mongodb.dto;

import com.app.mongodb.domain.User;

import java.io.Serializable;

/*
    DTO (Data Transfer Object): é um objeto que tem o papel
    de carregar dados das entidades de forma simples.
*/

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO() {

    }

    //Pega um user e instancia um DTO
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
