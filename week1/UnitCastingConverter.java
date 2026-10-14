package week1;

public class UnitCastingConverter {
     static void main(String[] args) {
       
        double totalCentimeters = 275.5; 
        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;
        
        System.out.println("========== UNIT CONVERTER SUMMARY ==========");
        System.out.println("Total Centimeters  : " + totalCentimeters + " cm");
        System.out.println("Equivalent Meters  : " + wholeMeters + " m and " + remainingCentimeters + " cm");
        System.out.println("--------------------------------------------");
        
       
        int stepsTaken = 1500;
        // No cast is needed (automatic widening) because an int has a smaller range 
       // than a double, so Java safely converts it without any data loss.
        double convertedDistanceMeters = stepsTaken; 
        
        System.out.println("[Implicit Widening Example (int to double)]");
        System.out.println("Steps (int)        : " + stepsTaken);
        System.out.println("Converted (double) : " + convertedDistanceMeters);
        System.out.println("--------------------------------------------");
        
        double exactPrice = 88.95;
        // Uses an explicit cast (int) because a double is larger and contains decimals. 
       // The fractional part or decimal values (.95) will be lost, leaving only the whole number (88).

        int roundedPrice = (int) exactPrice; 
        
        System.out.println("[Explicit Narrowing Example (double to int)]");
        System.out.println("Original (double)  : " + exactPrice);
        System.out.println("After Cast (int)   : " + roundedPrice);
        System.out.println("Data Lost          : The decimal part 0.95 was lost because we forced it to be stored in an int.\"");
        System.out.println("============================================");
    }
}