package diana.springframework.breweryproject.services;

import diana.springframework.breweryproject.web.model.CostumerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CostumerServiceImpl implements CostumerService {
    @Override
    public CostumerDto getCostumerById(UUID costumerId) {
        return CostumerDto.builder().id(UUID.randomUUID())
                .name("Diana")
                .build();
    }

    @Override
    public CostumerDto saveNewCostumer(CostumerDto costumerDto) {
        return CostumerDto.builder().id(UUID.randomUUID())
                .name("New Costumer")
                .build();
    }

    @Override
    public void updateCostumer(UUID costumerId, CostumerDto costumerDto) {
        //todo - implementation
    }

    @Override
    public void deleteById(UUID costumerId) {
        log.debug("Deleting costumer...");
    }
}
