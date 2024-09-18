package io.github.lengors.domain.repository;

import io.github.lengors.domain.model.DemoModel;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

import java.util.UUID;

@Repository
public interface DemoRepository extends ReactorCrudRepository<DemoModel, UUID> {

}
