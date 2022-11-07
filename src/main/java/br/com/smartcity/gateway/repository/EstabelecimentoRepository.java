package br.com.smartcity.gateway.repository;

import br.com.smartcity.gateway.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}
