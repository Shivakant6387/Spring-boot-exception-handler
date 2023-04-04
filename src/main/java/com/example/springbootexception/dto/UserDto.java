package com.example.springbootexception.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDto {
    @NotNull(message = "User name should not be null")
    private String userName;
    @Email(message = "invalid email address")
    private String userEmail;

    private String gender;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered")
    private String mobile;
    @Min(18)
    @Max(80)
    private int age;
    @NotBlank
    private String nationality;
}
