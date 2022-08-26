package com.nseit.NykaaApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    private String role;
    private String mailId;
    private Long phoneNumber;
    private String password;
}
