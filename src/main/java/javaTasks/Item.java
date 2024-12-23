package javaTasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {
    protected String name;
    protected double price;
    protected int quantity;

    public String sell(int amount) {
        if (this.quantity < amount) {
            return "Not enough quantity";
        } else {
            return "Items left: " + (this.quantity - amount);
        }
    }

    public int restock(int amount) {
        return this.quantity + amount;
    }
}
