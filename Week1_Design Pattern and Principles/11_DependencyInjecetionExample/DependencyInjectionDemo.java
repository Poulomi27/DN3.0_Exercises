//(ii)Interface Creation
interface CustomerRepository {
    Customer findCustomerById(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "Poulomi Pal");
    }
}

class Customer {
    private int id;
    private String name;
    
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer getCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }
}

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        
        Customer customer = customerService.getCustomerById(1);
        if(customer!=null)
        System.out.println("Customer Found: "+customer.getName());
        else
        System.out.println("Customer not Found");
    }
}
