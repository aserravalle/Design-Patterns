package VisitorPattern;

public class ResidentialCustomer extends Customer {
    @Override
    public void purchaseInsurance(InsuranceSalesman visitor) {
        visitor.sellResidentialInsurance();
    }
}
