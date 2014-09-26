import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.pluralsight."})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "customerService")
    @Scope("singleton")
    public CustomerService getCustomerService ()
    {
        CustomerServiceImpl customerService = new CustomerServiceImpl();

//        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }

//    @Bean(name = "customerRepository")
//
//    public CustomerRepository getCustomerRepository()
//    {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
