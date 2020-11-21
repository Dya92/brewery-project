package diana.springframework.breweryproject.web.controller;

import diana.springframework.breweryproject.services.CostumerService;
import diana.springframework.breweryproject.web.model.BeerDto;
import diana.springframework.breweryproject.web.model.CostumerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/costumer")
public class CostumerController {
    private final CostumerService costumerService;


    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping("/{costumerId}")
    public ResponseEntity<CostumerDto> getCostumer(@PathVariable UUID costumerId) {
        return new ResponseEntity<>(costumerService.getCostumerById(costumerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CostumerDto> handlePost(@RequestBody CostumerDto costumerDto) {
        CostumerDto savedDto = costumerService.saveNewCostumer(costumerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname(http://localhost:8080) to url
        headers.add("Location","api/v1/costumer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


    @PutMapping("/{costumerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable UUID costumerId, @RequestBody CostumerDto costumerDto) {
        costumerService.updateCostumer(costumerId, costumerDto);

    }

    @DeleteMapping("/{costumerId}")
    public void deleteCostumer(@PathVariable UUID costumerId) {
        costumerService.deleteById(costumerId);
    }

}
