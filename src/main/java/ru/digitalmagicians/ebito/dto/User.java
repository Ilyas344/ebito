package ru.digitalmagicians.ebito.dto;

import lombok.Data;

@Data
public class User {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String image;
}