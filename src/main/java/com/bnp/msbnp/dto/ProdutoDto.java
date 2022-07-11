package com.bnp.msbnp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {

    private Long codProduto;

    private String descricaoProduto;

    private String staStatus;

}
