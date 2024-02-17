package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> array1 = new ArrayList<>(Arrays.asList(27,3));
        Calculator calculator = new Calculator();
        System.out.println(calculator.GetSum(array1));

        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0));
        System.out.println(calculator.GetSum(array2));

        System.out.println(calculator.GetMultiplication(array2));

        System.out.println(calculator.GetDivision(array1));

        Calculator calculator3 = new Calculator(75);
        Calculator calculator4 = new Calculator("75");
        Calculator calculator5 = new Calculator((75.75));


        System.out.println(calculator3.getBinaryValue(calculator3.valueForBin));
        System.out.println(calculator4.getBinaryValue(calculator4.stringForBin));
        System.out.println(calculator5.getBinaryValue(calculator5.valueForBin));
    }
}

