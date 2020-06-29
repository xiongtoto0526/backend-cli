package com.company.business.user.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private Long id;
    private String name;
    private String password;
    private String email;

}