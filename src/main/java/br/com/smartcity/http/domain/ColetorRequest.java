package br.com.smartcity.http.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ColetorRequest {

    private Endereco endereco;
    private List<Rota> rotasAntendidas;
    private List<Veiculo> veiculos;
    private Pessoa pessoa;
}
