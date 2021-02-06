package com.subjectless.web.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private int num;
    private String userId;
    private String email;
    private String password;
    private String name;
    private LocalDateTime createTime;
}
