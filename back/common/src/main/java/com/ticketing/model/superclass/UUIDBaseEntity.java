package com.ticketing.model.superclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class UUIDBaseEntity {

    @Id
    protected String id;

}
