package week1;

public class Overflow {
    public static void main(String[] args)
    
    {
        System.out.println("========== VARIABLE OVERFLOWING DEMONSTRATE ==========");
        
        byte maxByte = 127;
        System.out.println("Original byte value: " + maxByte);
        maxByte++; 
        System.out.println("After incrementing past max (Overflow result): " + maxByte);
        
        
        System.out.println("\n==========STRING COMPARISON ==========");
       
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java"; 
        
        
        System.out.println("str1 == str2: " + (str1 == str2)); 
        //Why is str1 == str2 false? 
        // Because '==' checks if they are the same object reference in memory (memory address). 
        // Even though they have the same content, using 'new String()' creates two different objects in heap memory.
        
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        // True because '.equals()' checks the actual content (value) of the String, not the memory address.
        
        System.out.println("str1 == str3: " + (str1 == str3)); 
        // Why is str1 == str3 false? 
        // str1 is in the heap memory because 'new' was used, while str3 (literal) is taken from the String Pool. 
        // They have different memory locations, so '==' is false.
        
        System.out.println("str3.equals(str1): " + str3.equals(str1)); 
        // True because they are same 'java'
        
        
        System.out.println("\n========== SHARED ARRAY DEMONSTRATE ==========");
        int[] originalScores = {85, 90, 95};
        int[] sharedScores = originalScores; 
        
        
        System.out.print("Before modification - sharedScores[0]: " + sharedScores[0] + "\n");
        sharedScores[0] = 100;
        System.out.print("After modifying sharedScores[0] to 100:\n");
        System.out.print("originalScores[0] is now: " + originalScores[0] + "\n");
        System.out.println("================================================");
    }
}