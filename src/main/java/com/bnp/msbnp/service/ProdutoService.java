package com.bnp.msbnp.service;

import com.bnp.msbnp.domain.Produto;
import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.mapper.ProdutoMapper;
import com.bnp.msbnp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    private final static ProdutoMapper produtoMapper = ProdutoMapper.INSTANCE;

    public ProdutoDto inserirProduto (ProdutoDto produtoDto) {

        Produto produtoCreate = produtoMapper.toModel(produtoDto);
        Produto createProduto = produtoRepository.save(produtoCreate);

        return produtoMapper.toDto(createProduto);
    }

    public ProdutoDto findById (Long id) {

        Produto findProduto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException());

        return produtoMapper.toDto(findProduto);
    }

    public List<ProdutoDto> findAllProducts(ProdutoDto produtoDto) {

        return produtoRepository.findAll().stream().map(produtoMapper::toDto).collect(Collectors.toList());
    }

    public void deleteProductById(Long id) {
        produtoRepository.deleteById(id);

    }


}
