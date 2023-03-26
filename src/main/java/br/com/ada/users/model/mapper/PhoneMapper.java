package br.com.ada.users.model.mapper;

import br.com.ada.users.model.dto.PhoneCreationDTO;
import br.com.ada.users.model.dto.PhoneDTO;
import br.com.ada.users.model.dto.PhoneUpdateDTO;
import br.com.ada.users.model.entity.Phone;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhoneMapper {
    PhoneDTO parseDTO(Phone entity);
    Phone parseEntity(PhoneDTO dto);
    Phone parseEntity(PhoneCreationDTO creationDTO);
    Phone parseEntity(PhoneUpdateDTO updateDTO);
    List<PhoneDTO> parseListDTO(List<Phone> entities);

}
