package com.nseit.NykaaApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class ProductUser {
    @Id
    @GeneratedValue
    private Integer userId;
    private String name;
    private String role;
    private String mailId;
    private Long phoneNumber;
    private String password;

    @ManyToMany
    @JsonIgnore
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinTable(joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles;

    public ProductUser(String mailId, String password) {
        this.mailId = mailId;
        this.password = password;
    }
}
