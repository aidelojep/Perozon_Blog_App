package com.PerozonBloggingApplication1.PerozonBloggingApplication.data.model;

import javax.persistence.Id;
import java.util.UUID;


public class Authority {

    private UUID id;
    private String firstName;
    private String lastName;

    public Authority(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
