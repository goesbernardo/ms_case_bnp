package com.bnp.msbnp.dto;

import com.bnp.msbnp.domain.Produto;
import lombok.Data;

@Data
public class ProdutoCosifDto {


    private Produto codProduto;

    private String codCosif;

    private long codigoClassificacao;

    private Produto staStatus;

}
