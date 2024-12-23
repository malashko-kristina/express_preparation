package abstractDesign.discount;

public class EmployeeDiscount implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.30;
    }
}
