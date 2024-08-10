package Wrapper;

public class wrapperExample {
    public static void main(String[] args) {
        Integer num1 = new Integer(12);
        Float num2 = new Float(29.235);
        Float num3 = new Float(24.831f);
        Float num4 = new Float("24.831");
        Boolean b = new Boolean(true);
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("True");
        Boolean b3 = new Boolean("False");
        Boolean b4 = new Boolean("SomeString");

        b = false;
        int i = 5;
        i = 6;
        i = 7;
        Integer integer = 6;
        integer = 7;
        Integer seven = Integer.valueOf("111", 2);
        Integer hundred = Integer.valueOf("100", 10);
        int primitive = seven.intValue();
        float primitiveFloat = seven.floatValue();
        Float floatWrapper = Float.valueOf(57.0f);
        int floatToInt = floatWrapper.intValue();
        float floatToFloat = floatWrapper.floatValue();
        int sevenPrimitive = Integer.parseInt("111", 2);
        int hundredPrimitive = Integer.parseInt("100");
        Integer wrapperEight = new Integer(8);
        System.out.println(Integer.toString(wrapperEight));
        System.out.println(Integer.toString(wrapperEight, 2));
        System.out.println(Integer.toHexString(wrapperEight));
        System.out.println(Integer.toBinaryString(wrapperEight));
        System.out.println(Integer.toOctalString(wrapperEight));



        Integer ten = new Integer(10);
        ten++;
        Integer nineA = new Integer(9);
        Integer nineB = new Integer(9);
        System.out.println(nineA == nineB);
        System.out.println(nineA.equals(nineB));
        Integer nineC = 9;
        Integer nineD = 9;
        System.out.println(nineC == nineD);
        System.out.println(nineC.equals(nineD));


    }
}
