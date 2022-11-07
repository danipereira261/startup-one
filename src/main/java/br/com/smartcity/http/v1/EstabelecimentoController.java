package br.com.smartcity.http.v1;

import br.com.smartcity.http.domain.EstabelecimentoRequest;
import br.com.smartcity.service.EstabelecimentoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/estabelecimento")
@Api(tags = "Estabelecimento", produces = APPLICATION_JSON_VALUE)
public class EstabelecimentoController {


    @Autowired
    private EstabelecimentoService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void process(@RequestBody EstabelecimentoRequest request) {
        log.info("****[CONTROLLER - EstabelecimentoController - process()]****");
        service.process(request);
    }
}
