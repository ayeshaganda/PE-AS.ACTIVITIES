package week2;
public class CompoundGrowthTracker {
    public static void main(String[] args) {
        
        double balance = 1000.0;
        System.out.println("=========== COMPOUND GROWTH===========");
        System.out.println("Initial Balance: ₱" + balance);
        
        balance += 250.0;
        System.out.println("After adding bonus (+= 250.0)      : ₱" + balance);
          
        balance *= 1.15;
        System.out.println("After growth multiplier (*= 1.15)  : ₱" + balance);
        
        balance += 500.0;
        System.out.println("After adding deposit (+= 500.0)    : ₱" + balance);
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("[Testing count++]");
        int count = 5;
        System.out.println("Original count (count++): " + count++); 
        System.out.println("after count           : " + count);  
        System.out.println("-------------------------------------------------");

        
        System.out.println("[Testing ++count]");
        int counter = 5;
        System.out.println("Original count (++counter): " + ++counter); 
        System.out.println("after count (++counter):        : " + counter); 
        System.out.println("=================================================");
        
    }
}