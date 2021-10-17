package com.example.jwt.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {

    private long id;

    private Date created;

    private Date updated;
}
