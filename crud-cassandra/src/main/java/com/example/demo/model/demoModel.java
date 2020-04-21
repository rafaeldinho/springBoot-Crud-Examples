package com.example.demo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.UUID;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Table

    public class demoModel {
    @PrimaryKey
    private UUID id;
    private String name;
    private String email;
    private Boolean status;
}
