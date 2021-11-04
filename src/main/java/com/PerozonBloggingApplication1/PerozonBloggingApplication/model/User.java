package com.PerozonBloggingApplication1.PerozonBloggingApplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
public class User{

    private UUID id;
    private String firstName;
    private String lastName;
    private int password;

    public User(UUID id, String firstName, String lastName, int password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    @Id
    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassword() {
        return password;
    }

}
