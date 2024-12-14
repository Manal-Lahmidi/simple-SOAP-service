package ma.ensa.client;

import ma.ensa.client.GetCountryRequest;
import ma.ensa.client.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {

    public GetCountryResponse getCountry(GetCountryRequest request) {
        return (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);
    }
}
