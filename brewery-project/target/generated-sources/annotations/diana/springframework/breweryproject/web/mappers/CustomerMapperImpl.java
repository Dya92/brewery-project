package diana.springframework.breweryproject.web.mappers;

import diana.springframework.breweryproject.domain.Customer;
import diana.springframework.breweryproject.domain.Customer.CustomerBuilder;
import diana.springframework.breweryproject.web.model.CustomerDto;
import diana.springframework.breweryproject.web.model.CustomerDto.CustomerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-09T00:32:58+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.name( customer.getName() );

        return customerDto.build();
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.id( customerDto.getId() );
        customer.name( customerDto.getName() );

        return customer.build();
    }
}
