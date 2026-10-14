public class FourFunctionCalculator 
{
    public static void main(String[] args) {
        
        int num1 = 20;
        int num2 = -6;
        
       
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Integer division
        int remainder = num1 % num2; // Modulus operation
        
        System.out.println("=========== FOUR-FUNCTION CALCULATOR ===========");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("------------------------------------------------");
        System.out.println("Addition (+)       : " + sum);
        System.out.println("Subtraction (-)    : " + difference);
        System.out.println("Multiplication (*) : " + product);
        System.out.println("Division (/)       : " + quotient);
        System.out.println("Modulo (%)         : " + remainder);
        System.out.println("================================================");
       
    /*
     * - The Modulus operator (%) can be affected because it follows the sign 
     *   of the first number (dividend). If the first number is negative, the result can be negative.
     * - Division (/) also maintains sign rules where a negative quotient 
     *   appears when only one of them is negative.
     */
    }
}