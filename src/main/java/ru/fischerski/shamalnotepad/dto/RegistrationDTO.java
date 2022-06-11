package ru.fischerski.shamalnotepad.dto;

import lombok.Data;

@Data
public class RegistrationDTO {

    String email;
    String login;
    String password;
}