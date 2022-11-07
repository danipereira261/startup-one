package br.com.smartcity.http.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rota {

    private String logradouro;
    private String cep;
    private long numeroInicial;
    private long numeroFinal;
}
