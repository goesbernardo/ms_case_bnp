package com.bnp.msbnp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUTO_COSIF")
public class ProdutoCosif implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COL_COD_PRODUTO")
    private String codiProduto;

    @Column(name = "COD_COSIF")
    private String codiCosif;

    @Column(name = "COD_CLASSIFICACAO")
    private String codigoDaClassificacao;

    @Column(name = "STA_STATUS")
    private String stalStatus;


}
