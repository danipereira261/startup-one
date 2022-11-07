package br.com.smartcity.http.domain;

import br.com.smartcity.enums.TipoDoDescarte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdemDeServicoRequest {

    private Integer quantidaDeDejetosEmLitros;
    private String descricao;
    private TipoDoDescarte tipoDoDescarte;
    private long idEstabelecimento;
    private long idColetor;
    private String placaVeiculo;
}
