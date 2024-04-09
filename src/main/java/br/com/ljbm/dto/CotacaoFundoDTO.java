package br.com.ljbm.dto;

import br.com.ljbm.utilitarios.JSONSerdeCompatible;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CotacaoFundoDTO  implements JSONSerdeCompatible {

    private String nomeFundo;
    private LocalDate dataCotacao;
    private BigDecimal valorCota;
}
