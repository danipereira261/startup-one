package br.com.smartcity.http.v1;

import br.com.smartcity.http.domain.ColetorRequest;
import br.com.smartcity.service.ColetorService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/coletor")
@Api(tags = "Coletor", produces = APPLICATION_JSON_VALUE)
public class ColetorController {

    @Autowired
    private ColetorService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void process(@RequestBody ColetorRequest request) {
        log.info("****[CONTROLLER - ColetorController - process()]****");
        service.process(request);
    }
}
