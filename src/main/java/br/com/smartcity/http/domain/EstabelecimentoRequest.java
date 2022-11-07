package br.com.smartcity.http.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstabelecimentoRequest {

    private String nomeEstabelecimento;
    private Endereco endereco;
    private Rota rota;
    private Pessoa pessoa;
}
