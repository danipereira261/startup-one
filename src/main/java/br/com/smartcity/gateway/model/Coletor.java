package br.com.smartcity.gateway.model;

import br.com.smartcity.http.domain.Endereco;
import br.com.smartcity.http.domain.Pessoa;
import br.com.smartcity.http.domain.Rota;
import br.com.smartcity.http.domain.Veiculo;
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
@Entity
@Table(name = "TB_COLETOR")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Coletor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Endereco endereco;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<Rota> rotasAntendidas;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<Veiculo> veiculos;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Pessoa pessoa;
}
