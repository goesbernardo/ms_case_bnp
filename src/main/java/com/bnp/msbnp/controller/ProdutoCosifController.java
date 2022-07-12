package com.bnp.msbnp.controller;

import com.bnp.msbnp.dto.ProdutoCosifDto;
import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.service.ProdutoCosifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class ProdutoCosifController {

    @Autowired
    private ProdutoCosifService produtoCosifService;

    @PostMapping(value = "/insert")
    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProdutoCosifDto create(@RequestBody ProdutoCosifDto produtoDto){

        return produtoCosifService.inserirProduto(produtoDto);
    }
    @GetMapping(value = "/{id}")
    public ProdutoCosifDto findById(@PathVariable Long id){

        return produtoCosifService.findById(id);
    }
    @GetMapping
    public List<ProdutoCosifDto> findAll (ProdutoCosifDto produtoDto) {

        return produtoCosifService.findAllProducts(produtoDto);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {

        produtoCosifService.deleteProductById(id);
    }

}
