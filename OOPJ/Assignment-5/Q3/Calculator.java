import java.util.*;

public class Calculator {

    public static <T extends Number> void calculate(T[] data) {

        double sum = 0;

        for (T num : data) {
            sum += num.doubleValue(); // convert to double
        }

        double avg = sum / data.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("----------------------");
    }
}