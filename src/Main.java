public class Main {
    public static void main(String[] args)
    {
        int intOperandA =100;
        int intOperandB =15;
        int intSum =0;
        int intDifference =0;
        int intProduct =0;
        int intQuotient =0;
        int intModulo =0;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        // Put in the rest of the int statements here

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA =20.5;
        double doubleOperandB =10.5;
        double doubleSum =0;
        double doubleDifference =0;
        double doubleProduct =0;
        double doubleQuotient =0;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);


    }
}