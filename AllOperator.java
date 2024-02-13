import java.math.BigDecimal;

public class AllOperator  {
    public static void main(String[] args) {
        // Arithmetic Operators
        int num1 = 10;
        int num2 = 5;
        int additionResult = num1 + num2;
        int subtractionResult = num1 - num2;
        int multiplicationResult = num1 * num2;
        int divisionResult = num1 / num2;
        int modulusResult = num1 % num2;
        num1++;
        num2--;

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Modulus: " + modulusResult);
        System.out.println("Incremented num1: " + num1);
        System.out.println("Decremented num2: " + num2);

        // Comparison Operators
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreaterThan = num1 > num2;
        boolean isLessThan = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        System.out.println("Is num1 equal to num2? " + isEqual); // false
        System.out.println("Is num1 not equal to num2? " + isNotEqual); // true
        System.out.println("Is num1 greater than num2? " + isGreaterThan); // true
        System.out.println("Is num1 less than num2? " + isLessThan); // false
        System.out.println("Is num1 greater than or equal to num2? " + isGreaterOrEqual); // true
        System.out.println("Is num1 less than or equal to num2? " + isLessOrEqual); // false

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        boolean logicalAndResult = condition1 && condition2;
        boolean logicalOrResult = condition1 || condition2;
        boolean logicalNotResult = !condition1;

        System.out.println("Logical AND: " + logicalAndResult); // false
        System.out.println("Logical OR: " + logicalOrResult); // true
        System.out.println("Logical NOT: " + logicalNotResult); // false

        // Conditional (Ternary) Operator
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : y; // Conditional operator
        System.out.println("Maximum value: " + max); // 20
        int z = x+++y;
        System.out.println(z);

        // Bitwise Operators (using binary representation)
        int binaryNum1 = 0b1010;
        int binaryNum2 = 0b1100;
        int bitwiseAndResult = binaryNum1 & binaryNum2;
        int bitwiseOrResult = binaryNum1 | binaryNum2;
        int bitwiseXorResult = binaryNum1 ^ binaryNum2;
        int bitwiseNotResult = ~binaryNum1;
        int leftShiftResult = binaryNum1 << 2;
        int rightShiftResult = binaryNum2 >> 1;

        System.out.println("Bitwise AND: " + Integer.toBinaryString(bitwiseAndResult));
        System.out.println("Bitwise OR: " + Integer.toBinaryString(bitwiseOrResult));
        System.out.println("Bitwise XOR: " + Integer.toBinaryString(bitwiseXorResult));
        System.out.println("Bitwise NOT: " + Integer.toBinaryString(bitwiseNotResult));
        System.out.println("Left Shift: " + Integer.toBinaryString(leftShiftResult));
        System.out.println("Right Shift: " + Integer.toBinaryString(rightShiftResult));
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
        final BigDecimal TEN_CENTS = new BigDecimal( ".10");
        BigDecimal funds1 = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds1.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds1 = funds1.subtract(price);
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
    }
