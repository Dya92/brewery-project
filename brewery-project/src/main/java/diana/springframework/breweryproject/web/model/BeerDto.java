package diana.springframework.breweryproject.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    //universally unique identifier = UUID
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
