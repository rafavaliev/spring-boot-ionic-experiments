package ru.dobrotrener.springbootionicexperiments.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dobrotrener.springbootionicexperiments.domain.Beer;
import ru.dobrotrener.springbootionicexperiments.repository.BeerRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class BeerController {
    private final BeerRepository beerRepository;

    public BeerController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @GetMapping("/good-beers")
    @CrossOrigin(origins = {"http://localhost:8100", "http://localhost:8080"})
    public Collection<Beer> goodBeers() {

        return beerRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Beer beer) {
        log.info("Is great: " + beer.getName());
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");
    }
}