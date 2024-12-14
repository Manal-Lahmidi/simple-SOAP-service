package ma.ensa.mysoapservice;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Initialize countries map
        Country morocco = new Country();
        morocco.setName("Morocco");
        morocco.setPopulation(37000000);
        morocco.setCapital("Rabat");
        morocco.setCurrency(Currency.DH);

        countries.put(morocco.getName(), morocco);
        // Ajoutez d'autres pays ici
    }

    public Country findCountry(String name) {
        try {
            Thread.sleep(200); // Simuler un accès réseau
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return countries.get(name);
    }
    public void addCountry(Country country) {
        countries.put(country.getName(), country);
    }

    public void updateCountry(String name, Country updatedCountry) {
        countries.put(name, updatedCountry);
    }

    public void deleteCountry(String name) {
        countries.remove(name);
    }

    public Map<String, Country> getAllCountries() {
        return countries;
    }
}
