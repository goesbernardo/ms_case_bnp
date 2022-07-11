package com.bnp.msbnp.mapper;


import com.bnp.msbnp.domain.Produto;
import com.bnp.msbnp.dto.ProdutoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    Produto toModel (ProdutoDto produtoDto);

    ProdutoDto toDto(Produto produto);
}
