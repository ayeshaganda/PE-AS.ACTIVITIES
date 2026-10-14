package week3;
public class SimpleGradeClassifier 
{
    
 public static void main(String[] args) {
        
        int score = 45; 
        
        System.out.println("=========== GRADE CLASSIFIER ===========");
        System.out.println("Student Score : " + score);
        System.out.println("----------------------------------------");
        
       
        if (score >= 60) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
        System.out.println("========================================");
    }
}
