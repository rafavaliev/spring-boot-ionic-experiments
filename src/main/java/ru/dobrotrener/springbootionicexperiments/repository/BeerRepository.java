package ru.dobrotrener.springbootionicexperiments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.dobrotrener.springbootionicexperiments.domain.Beer;

import java.util.List;

@RepositoryRestResource(collectionResourceRel =  "beers", path = "beers")
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
public interface BeerRepository extends JpaRepository<Beer, Long> {
}