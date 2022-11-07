package br.com.smartcity.service;

import br.com.smartcity.gateway.model.Estabelecimento;
import br.com.smartcity.gateway.repository.EstabelecimentoRepository;
import br.com.smartcity.http.domain.EstabelecimentoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository repository;

    public void process(EstabelecimentoRequest request) {
        repository.save(Estabelecimento
                .builder()
                .nomeEstabelecimento(request.getNomeEstabelecimento())
                .endereco(request.getEndereco())
                .rota(request.getRota())
                .pessoa(request.getPessoa())
                .build());
    }
}
