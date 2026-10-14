public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        double averageGrade = 74.5;
        int absences = 2;
        boolean hasPassed = (averageGrade >= 75 && absences <= 3) || (averageGrade >= 90);
        
        
        System.out.println("=========== GRADE THRESHOLD CHECKER ===========");
        System.out.println("Average Grade : " + averageGrade);
        System.out.println("Absences      : " + absences);
        System.out.println("-----------------------------------------------");
        
        if (hasPassed) {
            System.out.println("Status: PASS");
            if (averageGrade >= 90) {
                System.out.println("Reasoning: Passed because the average grade is 90 or higher (regardless of the number of absences).");
            } else {
                System.out.println("Reasoning: Passed because the average grade did not drop below 75 AND absences did not exceed 3.");
            }
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reasoning: Did not meet the minimum grade of 75 (with max 3 absences).");
        }
        
        System.out.println("===============================================");
    }
}