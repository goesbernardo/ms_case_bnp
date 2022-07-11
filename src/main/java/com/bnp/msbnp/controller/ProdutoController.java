package com.bnp.msbnp.controller;

import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProdutoDto create(@RequestBody ProdutoDto produtoDto){

        return produtoService.create(produtoDto);
    }
}
