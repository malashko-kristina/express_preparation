package abstractDesign.discount;

public class DiscountCalculatorTest {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Discount for a regular user is: " + calculator.calculateDiscount(CustomerType.REGULAR, 100.0));
        System.out.println("Discount for a VIP user is: " + calculator.calculateDiscount(CustomerType.VIP, 100.0));
        System.out.println("Discount for an employee user is: " + calculator.calculateDiscount(CustomerType.EMPLOYEE, 100.0));
    }
}

