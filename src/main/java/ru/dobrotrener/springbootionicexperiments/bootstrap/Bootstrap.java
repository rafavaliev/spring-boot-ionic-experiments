package ru.dobrotrener.springbootionicexperiments.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.dobrotrener.springbootionicexperiments.domain.Beer;
import ru.dobrotrener.springbootionicexperiments.repository.BeerRepository;

import java.util.stream.Stream;

@Component
@Slf4j
public class Bootstrap implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public Bootstrap(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("Bootstrap started");
        loadBeer();
        log.info("Bootstrap finished");
    }

    private void loadBeer() {
        Stream.of("Kentucky Brunch Brand Stout",
                "Good Morning",
                "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR")
                .forEach(name -> beerRepository.save(new Beer(name))
        );
        beerRepository.findAll().forEach(System.out::println);
        log.info("Loaded beer list size: " + beerRepository.count());
    }
}