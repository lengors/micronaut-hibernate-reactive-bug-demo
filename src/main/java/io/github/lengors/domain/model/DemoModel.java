package io.github.lengors.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Entity
public record DemoModel(@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id) {

}
