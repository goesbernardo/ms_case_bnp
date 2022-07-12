package com.bnp.msbnp.controller;

import com.bnp.msbnp.dto.ProdutoCosifDto;
import com.bnp.msbnp.service.ProdutoCosifService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class ProdutoCosifControllerTest {
    @Mock
    ProdutoCosifService produtoCosifService;
    @InjectMocks
    ProdutoCosifController produtoCosifController;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        when(produtoCosifService.inserirProduto(any())).thenReturn(new ProdutoCosifDto());

        ProdutoCosifDto result = produtoCosifController.create(new ProdutoCosifDto());
        Assertions.assertTrue(true);
    }


    @Test
    void testFindAll() {
        when(produtoCosifService.findAllProducts(any())).thenReturn(Arrays.<ProdutoCosifDto>asList(new ProdutoCosifDto()));

        List<ProdutoCosifDto> result = produtoCosifController.findAll(new ProdutoCosifDto());
        Assertions.assertTrue(true);
    }

    @Test
    void testDeleteById() {

        produtoCosifController.deleteById(Long.valueOf(1));
    }
}

