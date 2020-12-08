package diana.springframework.breweryproject.web.mappers;

import diana.springframework.breweryproject.domain.Beer;
import diana.springframework.breweryproject.domain.Beer.BeerBuilder;
import diana.springframework.breweryproject.web.model.BeerDto;
import diana.springframework.breweryproject.web.model.BeerDto.BeerDtoBuilder;
import diana.springframework.breweryproject.web.model.v2.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-09T00:32:58+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( beer.getBeerStyle().name() );
        }
        beerDto.upc( beer.getUpc() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        beer.beerName( dto.getBeerName() );
        if ( dto.getBeerStyle() != null ) {
            beer.beerStyle( Enum.valueOf( BeerStyleEnum.class, dto.getBeerStyle() ) );
        }
        beer.upc( dto.getUpc() );
        beer.createdDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beer.lastUpdatedDate( dateMapper.asTimestamp( dto.getLastUpdatedDate() ) );

        return beer.build();
    }
}
