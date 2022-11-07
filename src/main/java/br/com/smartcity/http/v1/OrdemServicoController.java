package br.com.smartcity.http.v1;

import br.com.smartcity.http.domain.OrdemDeServicoRequest;
import br.com.smartcity.service.OrdemServicoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/os")
@Api(tags = "Ordem de Serviço", produces = APPLICATION_JSON_VALUE)
public class OrdemServicoController {

    @Autowired
    private OrdemServicoService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void process(@RequestBody OrdemDeServicoRequest request) {
        log.info("****[CONTROLLER - OrdemServicoController - process()]****");
        service.process(request);
    }
}
