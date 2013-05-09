package calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Double> stack = new ArrayList<>();

    public void push(double arg) {
        stack.add(arg);
    }

    public double divide() {
        return stack.get(0) / stack.get(1);
    }
}