package Seminar4;

import java.util.List;



public class Calculator {

    public Number valueForBin;
    public String stringForBin;

    public Calculator(Number valueForBin) {
        this.valueForBin = valueForBin;
    }

    public Calculator(String stringForBin) {
        this.stringForBin = stringForBin;
    }

    public Calculator() {
    }


    public double GetSum(List<? extends Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

    public double GetMultiplication(List<? extends Number> list) {
        double mult = 1;
        for (int i = 0; i < list.size(); i++) {
            mult *= list.get(i).doubleValue();
        }
        return mult;
    }

    public double GetDivision(List<? extends Number> list) {
        double result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            result = list.get(i).doubleValue() / list.get(i + 1).doubleValue();
        }
        return result;
    }

    public String getBinaryValue(Object value) {
        String result = "";
        /**
         * Проверка на int с бинарным переводом
         */
        if (value instanceof Integer) {
            if ((Integer) value == 0) {
                return "";
            }
            result = getBinaryValue((Integer) value / 2) + ((Integer) value % 2);
            /**
             * Проверка на String с бинарным переводом
             */
        } else if (value instanceof String) { //&& !isNaN((Number) value)) Как здесь проверить,можно ли value запарсить в int?
            value = Integer.parseInt((String) value);

            if ((Integer) value == 0) {
                return "";
            }
            result = getBinaryValue((Integer) value / 2) + ((Integer) value % 2);

            /**
             * Проверка на float/double с бинарным переводом целой и дробной частей
             */
        } else if (value instanceof Float || value instanceof Double) {
            String binIntPart = "";
            String binFractPart = "";

            int intPart =  ((Number) value).intValue();
            double fractPart = (double) value - intPart;
            if (intPart == 0) {
                return "";
            }
            binIntPart = getBinaryValue(intPart / 2) + intPart % 2;

            while (fractPart > 0) {
                fractPart *= 2;
                if (fractPart >= 1) {
                    binFractPart += "1";
                    fractPart -= 1;
                } else {
                    binFractPart += "0";
                }

            }
            result = STR."\{binIntPart}.\{binFractPart}";
        }
        return result;
    }


}
















