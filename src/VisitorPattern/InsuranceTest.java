import java.util.Arrays;
import java.util.List;

public class InsuranceTest {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new BusinessCustomer(),
            new ResidentialCustomer(),
            new BusinessCustomer(),
            new BusinessCustomer(),
            new ResidentialCustomer()
        );
        InsuranceSalesman visitor = new InsuranceSalesman();

        for (Customer customer : customers) {
            customer.purchaseInsurance(visitor);
        }
    }
}
