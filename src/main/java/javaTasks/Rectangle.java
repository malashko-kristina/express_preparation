package javaTasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {
    protected int width;
    protected int height;

    public int calculateArea() {
        return this.width * this.height;
    }

    public int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
