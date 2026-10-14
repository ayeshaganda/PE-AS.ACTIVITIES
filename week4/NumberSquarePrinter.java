package week4;
public class NumberSquarePrinter {
    public static void main(String[] args) {


        System.out.println("=========== NUMBER & SQUARE PRINTER ==========="); 
        int loopBound = 20; 
        
        for (int i = 1; i <= loopBound; i++) {
            
            int square = i * i;
            System.out.println("Number: " + i + " | Square: " + square);
        }
        
        System.out.println("===============================================");
    }
}