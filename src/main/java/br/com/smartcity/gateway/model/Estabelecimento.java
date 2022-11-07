package br.com.smartcity.gateway.model;

import br.com.smartcity.http.domain.Endereco;
import br.com.smartcity.http.domain.Pessoa;
import br.com.smartcity.http.domain.Rota;
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
@Entity
@Table(name = "TB_ESTABELECIMENTO")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeEstabelecimento;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Endereco endereco;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Rota rota;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Pessoa pessoa;
}
