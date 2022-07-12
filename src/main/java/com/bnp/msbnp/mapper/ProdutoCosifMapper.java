package com.bnp.msbnp.mapper;

import com.bnp.msbnp.domain.ProdutoCosif;
import com.bnp.msbnp.dto.ProdutoCosifDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoCosifMapper {

    ProdutoCosifMapper INSTANCE = Mappers.getMapper(ProdutoCosifMapper.class);

    ProdutoCosif toModel(ProdutoCosifDto dto);

    ProdutoCosifDto toDto(ProdutoCosif produtoCosif);
}
