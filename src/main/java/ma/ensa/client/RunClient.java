package ma.ensa.client;

import ma.ensa.client.GetCountryRequest;
import ma.ensa.client.GetCountryResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RunClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountryClientConfig.class);
        CountryClient client = context.getBean(CountryClient.class);

        GetCountryRequest request = new GetCountryRequest();
        request.setName("Morocco");

        GetCountryResponse response = (GetCountryResponse) client.getCountry(request);
        System.out.println("Response: " + response.getCountry().getCapital());
    }
}
