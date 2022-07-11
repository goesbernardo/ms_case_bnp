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
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_PRODUTO")
    private Long codProduto;

    @Column(name = "DESC_PRODUTO")
    private String descricaoProduto;

    @Column(name = "STA_STATUS")
    private String staStatus;


}
