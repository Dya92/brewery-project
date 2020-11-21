package diana.springframework.breweryproject.services;

import diana.springframework.breweryproject.web.model.CostumerDto;

import java.util.UUID;

public interface CostumerService {
    CostumerDto getCostumerById(UUID costumerId);

    CostumerDto saveNewCostumer(CostumerDto costumerDto);

    void updateCostumer(UUID costumerId, CostumerDto costumerDto);

    void deleteById(UUID costumerId);
}
