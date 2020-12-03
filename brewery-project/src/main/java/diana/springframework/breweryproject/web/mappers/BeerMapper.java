package diana.springframework.breweryproject.web.mappers;

import diana.springframework.breweryproject.domain.Beer;
import diana.springframework.breweryproject.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
