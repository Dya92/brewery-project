package diana.springframework.breweryproject.web.mappers;

import diana.springframework.breweryproject.domain.Customer;
import diana.springframework.breweryproject.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
