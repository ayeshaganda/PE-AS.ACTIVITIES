package week4;
public class SumUntilSentinelValue {
    public static void main(String[] args) {
        System.out.println("=========== SUM UNTIL SENTINEL VALUE ===========");
        
        
        int[] inputSequence = {10, -5, 20, 15, -1, 50};
        
        int runningTotal = 0;
        int index = 0;
        
        
        while (index < inputSequence.length) {
            int currentInput = inputSequence[index];
            
           
            if (currentInput == -1) {
                break; 
            }
            
            
            runningTotal += currentInput;
            System.out.println("Added: " + currentInput + " | Current Total: " + runningTotal);
            
            index++;
        }
        
    
        System.out.println("--------------------------------------------------");
        System.out.println("Final Total (Sentinel -1 reached): " + runningTotal);
        System.out.println("==================================================");
    }
}