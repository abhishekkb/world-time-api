package org.abhi.worldtime.service;

import org.abhi.worldtime.model.TimeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class WorldTimeService {

    private final RestTemplate restTemplate;
    private final String url;

    private final SomeOtherClass someOtherClass;

    public WorldTimeService(@Autowired RestTemplate restTemplate,
                            @Value("${world.time.url}") String url,
                            SomeOtherClass someOtherClass) {
        this.restTemplate = restTemplate;
        this.url = url;
        this.someOtherClass = someOtherClass;
    }

    public List<TimeResponse> getTime(Map<String, String> parameters){
        someOtherClass.method1();
        URI uri = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(parameters)
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<TimeResponse[]> responseEntity =  restTemplate.exchange(uri, HttpMethod.GET, entity, TimeResponse[].class);
        return List.of(Objects.requireNonNull(responseEntity.getBody()));
    }
}
