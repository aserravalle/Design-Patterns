public class BusinessCustomer extends Customer {
    @Override
    public void purchaseInsurance(InsuranceSalesman visitor) {
        visitor.sellBusinessInsurance();
    }
}
