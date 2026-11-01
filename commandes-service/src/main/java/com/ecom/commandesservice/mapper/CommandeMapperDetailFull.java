package com.ecom.commandesservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import com.ecom.commandesservice.dto.CommandeDtoFull;
import com.ecom.commandesservice.entite.Commande;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses={LigneCommandeMapperFull.class})
public interface CommandeMapperDetailFull {
    @Mapping(target = "clientName", ignore = true)
    @Mapping(target = "clientEmail", ignore = true)
    CommandeDtoFull toDto(Commande commande);
}
