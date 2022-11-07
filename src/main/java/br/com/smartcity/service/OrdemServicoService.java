package br.com.smartcity.service;

import br.com.smartcity.gateway.model.OrdemDeServico;
import br.com.smartcity.gateway.repository.OrdemDeServicoRepository;
import br.com.smartcity.http.domain.OrdemDeServicoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemDeServicoRepository repository;

    public void process(OrdemDeServicoRequest request) {
        repository.save(OrdemDeServico
                .builder()
                .dataRegistro(LocalDateTime.now())
                .quantidaDeDejetosEmLitros(request.getQuantidaDeDejetosEmLitros())
                .descricao(request.getDescricao())
                .tipoDoDescarte(request.getTipoDoDescarte())
                .idEstabelecimento(request.getIdEstabelecimento())
                .idColetor(request.getIdColetor())
                .placaVeiculo(request.getPlacaVeiculo())
                .build());
    }
}
