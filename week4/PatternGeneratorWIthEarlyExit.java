package week4;
public class PatternGeneratorWIthEarlyExit {
    public static void main(String[] args) {
        System.out.println("=========== PATTERN GENERATOR WITH EARLY EXIT ============");
        
        int size = 5;
         
        for (int row = 1; row <= size; row++) {
            
            if (row == 3) {
                System.out.println("Row " + row + " -> [SKIPPED gamit ang continue statement]");
                continue; 
            }
            
            System.out.print("Row " + row + " : ");
            
            for (int col = 1; col <= size; col++) {
                
                
                if (col == 4) {
                    System.out.print("[STOPPED/BREAK]");
                    break; 
                }
                
                System.out.print("* ");
            }
            
            System.out.println(); 
        }
        
        System.out.println("==========================================================");
        
        /*
         * - Ang 'continue' statement po ay ginamit sa row == 3 para laktawan ang buong proseso 
         *   ng pag-print para sa row na iyon at agad na ibalik ang takbo sa panlabas na loop.
         * - Ang 'break' statement ay ginamit sa col == 4 para putulin at itigil nang maaga 
         *   ang pag-ikot ng inner loop kapag naabot na ang kolum na ito, kahit hindi pa tapos ang kabuuang sukat.
         */
    }
}
