package ru.dobrotrener.springbootionicexperiments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.dobrotrener.springbootionicexperiments.domain.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}