package br.com.smartcity.service;

import br.com.smartcity.gateway.model.Coletor;
import br.com.smartcity.gateway.repository.ColetorRepository;
import br.com.smartcity.http.domain.ColetorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColetorService {

    @Autowired
    private ColetorRepository repository;

    public void process(ColetorRequest request) {
        repository.save(Coletor
                .builder()
                .endereco(request.getEndereco())
                .rotasAntendidas(request.getRotasAntendidas())
                .veiculos(request.getVeiculos())
                .pessoa(request.getPessoa())
                .build());
    }
}
