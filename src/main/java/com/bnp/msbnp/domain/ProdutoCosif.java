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
    @Column(name = "COD_PRODUTO")
    @OneToOne
    private Produto codProduto;

    @Column(name = "COD_COSIF")
    private String codCosif;

    @Column(name = "COD_CLASSIFICACAO")
    private long codigoClassificacao;

    @OneToOne
    private Produto staStatus;


}
