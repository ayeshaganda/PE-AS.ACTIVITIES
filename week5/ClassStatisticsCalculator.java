package week5;
public class ClassStatisticsCalculator {
    public static void main(String[] args) {
        System.out.println("=========== CLASS STATISTICS CALCULATOR ============");
        
       
        int[] studentScores = {80, 92, 78, 65, 95, 88, 72, 91};
        
      
        System.out.print("Student Scores: ");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print(studentScores[i] + (i < studentScores.length - 1 ? ", " : ""));
        }
        System.out.println("\n----------------------------------------------------");
        
       
        int sum = 0;
        int highest = studentScores[0];
        int lowest = studentScores[0];
        
        for (int i = 0; i < studentScores.length; i++) {
          
            sum += studentScores[i];
            
            
            if (studentScores[i] > highest) {
                highest = studentScores[i];
            }
            
           
            if (studentScores[i] < lowest) {
                lowest = studentScores[i];
            }
        }
        
        
        double average = (double) sum / studentScores.length;
        
       
        System.out.println("Total Sum     : " + sum);
        System.out.println("Class Average : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);
        System.out.println("====================================================");
    }
}