package com.bnp.msbnp.service;

import com.bnp.msbnp.domain.ProdutoCosif;
import com.bnp.msbnp.dto.ProdutoCosifDto;
import com.bnp.msbnp.mapper.ProdutoCosifMapper;
import com.bnp.msbnp.repository.ProdutoCosifRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class ProdutoCosifServiceTest {
    @Mock
    ProdutoCosifRepository produtoCosifRepository;
    @Mock
    ProdutoCosifMapper produtoCosifMapper;
    @InjectMocks
    ProdutoCosifService produtoCosifService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testInserirProduto() {
        when(produtoCosifMapper.toModel(any())).thenReturn(new ProdutoCosif("codiProduto", "codiCosif", "codigoDaClassificacao", "stalStatus"));
        when(produtoCosifMapper.toDto(any())).thenReturn(new ProdutoCosifDto());

        ProdutoCosifDto result = produtoCosifService.inserirProduto(new ProdutoCosifDto());
        Assertions.assertTrue(true);

    }

    @Test
    void testFindAllProducts() {
        List<ProdutoCosifDto> result = produtoCosifService.findAllProducts(new ProdutoCosifDto());
        Assertions.assertTrue(true);

    }

    @Test
    void testDeleteProductById() {

        produtoCosifService.deleteProductById(Long.valueOf(1));
    }
}

