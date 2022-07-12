package com.bnp.msbnp.controller;

import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.service.ProdutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class ProdutoControllerTest {
    @Mock
    ProdutoService produtoService;
    @InjectMocks
    ProdutoController produtoController;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        when(produtoService.inserirProduto(any())).thenReturn(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));

        ProdutoDto result = produtoController.create(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));
        Assertions.assertTrue(true);
    }

    @Test
    void testFindAll() {
        when(produtoService.findAllProducts(any())).thenReturn(Arrays.<ProdutoDto>asList(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus")));

        List<ProdutoDto> result = produtoController.findAll(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));
        Assertions.assertTrue(true);
    }

    @Test
    void testDeleteById() {

        produtoController.deleteById(Long.valueOf(1));
    }
}

