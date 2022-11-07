package br.com.smartcity.http.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    private long capacidadeEmLitros;
    private String placa;
    private String marca;
    private String modelo;
    private String anoDeFabricacao;
}
