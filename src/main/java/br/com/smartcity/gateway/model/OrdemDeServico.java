package br.com.smartcity.gateway.model;

import br.com.smartcity.enums.TipoDoDescarte;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ORDEM_SERVICO")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dataRegistro;
    private Integer quantidaDeDejetosEmLitros;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoDoDescarte tipoDoDescarte;
    private long idEstabelecimento;
    private long idColetor;
    private String placaVeiculo;
}
