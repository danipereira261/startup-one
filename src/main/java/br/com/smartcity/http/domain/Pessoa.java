package br.com.smartcity.http.domain;

import br.com.smartcity.enums.TipoPessoa;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;
}
