package com.bnp.msbnp.service;

import com.bnp.msbnp.domain.ProdutoCosif;
import com.bnp.msbnp.dto.ProdutoCosifDto;
import com.bnp.msbnp.dto.ProdutoDto;
import com.bnp.msbnp.mapper.ProdutoCosifMapper;
import com.bnp.msbnp.repository.ProdutoCosifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoCosifService {

    @Autowired
    private ProdutoCosifRepository produtoCosifRepository;

    private final static ProdutoCosifMapper produtoCosifMapper = ProdutoCosifMapper.INSTANCE;

    public ProdutoCosifDto inserirProduto (ProdutoCosifDto produtoDto) {

        ProdutoCosif produtoCreate = produtoCosifMapper.toModel(produtoDto);
        ProdutoCosif createProduto = produtoCosifRepository.save(produtoCreate);

        return produtoCosifMapper.toDto(createProduto);
    }

    public ProdutoCosifDto findById (Long id) {

        ProdutoCosif findProduto = produtoCosifRepository.findById(id).orElseThrow(() -> new RuntimeException());

        return produtoCosifMapper.toDto(findProduto);
    }

    public List<ProdutoCosifDto> findAllProducts(ProdutoCosifDto produtoDto) {

        return produtoCosifRepository.findAll().stream().map(produtoCosifMapper::toDto).collect(Collectors.toList());
    }

    public void deleteProductById(Long id) {
        produtoCosifRepository.deleteById(id);

    }


}
