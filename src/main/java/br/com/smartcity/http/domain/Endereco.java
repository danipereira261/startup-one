package br.com.smartcity.http.domain;

import br.com.smartcity.enums.TipoEndereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String municipio;
    private String estado;
    private String uf;
    private String numeroLogradouro;
    private String complementoLogradouro;
    @Enumerated(EnumType.STRING)
    private TipoEndereco tipoEndereco;
}
