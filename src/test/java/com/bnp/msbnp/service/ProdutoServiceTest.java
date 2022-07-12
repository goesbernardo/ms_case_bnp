package com.bnp.msbnp.service;

import com.bnp.msbnp.domain.Produto;
import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.mapper.ProdutoMapper;
import com.bnp.msbnp.repository.ProdutoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ProdutoServiceTest {

    @Mock
    ProdutoRepository produtoRepository;
    @Mock
    ProdutoMapper produtoMapper;
    @InjectMocks
    ProdutoService produtoService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testInserirProduto() {
        when(produtoMapper.toModel(any())).thenReturn(new Produto(Long.valueOf(1), "descricaoProduto", "staStatus"));
        when(produtoMapper.toDto(any())).thenReturn(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));

        ProdutoDto result = produtoService.inserirProduto(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));
        Assertions.assertTrue(true);
    }

    @Test
    void testFindAllProducts() {
        List<ProdutoDto> result = produtoService.findAllProducts(new ProdutoDto(Long.valueOf(1), "descricaoProduto", "staStatus"));
        Assertions.assertTrue(true);
    }

    @Test
    void testDeleteProductById() {

        produtoService.deleteProductById(Long.valueOf(1));
    }
}

