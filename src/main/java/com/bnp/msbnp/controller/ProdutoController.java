package com.bnp.msbnp.controller;

import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/insert")
    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProdutoDto create(@RequestBody ProdutoDto produtoDto){

        return produtoService.inserirProduto(produtoDto);
    }
    @GetMapping(value = "/{id}")
    public ProdutoDto findById(@PathVariable Long id){

        return produtoService.findById(id);
    }
    @GetMapping
    public List<ProdutoDto> findAll (ProdutoDto produtoDto) {

        return produtoService.findAllProducts(produtoDto);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {

        produtoService.deleteProductById(id);
    }

}
