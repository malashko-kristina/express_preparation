package abstractDesign.discount;

import java.util.HashMap;
import java.util.Map;

// Подумать над улучшением кода
// public class DiscountCalculator {
//    public double calculateDiscount(String customerType, double amount) {
//        if (customerType.equals("regular")) {
//            return amount * 0.05;
//        } else if (customerType.equals("vip")) {
//            return amount * 0.10;
//        } else if (customerType.equals("employee")) {
//            return amount * 0.30;
//        } else {
//            return 0;
//        }
//    }
//}

public class DiscountCalculator {

    private final Map<CustomerType, DiscountStrategy> strategies = new HashMap<>();

    public DiscountCalculator() {
        strategies.put(CustomerType.REGULAR, new RegularDiscount());
        strategies.put(CustomerType.VIP, new VipDiscount());
        strategies.put(CustomerType.EMPLOYEE, new EmployeeDiscount());
    }

    public double calculateDiscount(CustomerType customerType, double amount) {
        DiscountStrategy strategy = strategies.get(customerType);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown customer type: " + customerType);
        }
        return strategy.calculate(amount);
    }
}
