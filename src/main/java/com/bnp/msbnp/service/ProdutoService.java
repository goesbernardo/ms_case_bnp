package com.bnp.msbnp.service;

import com.bnp.msbnp.domain.Produto;
import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.mapper.ProdutoMapper;
import com.bnp.msbnp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    private final static ProdutoMapper produtoMapper = ProdutoMapper.INSTANCE;

    public ProdutoDto create (ProdutoDto produtoDto) {

        Produto produtoCreate = produtoMapper.toModel(produtoDto);
        Produto createProduto = produtoRepository.save(produtoCreate);

        return produtoMapper.toDto(createProduto);
    }


}
