package com.generation.progettoripassopane.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@MappedSuperclass //strategia 1 - Metti i campi qui dichiarati nella tabella che viene creata per la classe che estende BaseEntity
@Getter
@Setter
public abstract class BaseEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
}
