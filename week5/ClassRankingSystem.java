package week5;
class Student {
    String name;
    double[] quizzes;
    double average;

   
    public Student(String name, double[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = computeAverage();
    }

    private double computeAverage() {
        double sum = 0;
        for (double score : quizzes) {
            sum += score;
        }
        return sum / quizzes.length;
    }
}

public class ClassRankingSystem {

    
    public static int linearSearchRank(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                return i + 1; 
            }
        }
        return -1; 
    }

    
    public static void sortStudentsByAverage(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=========== CLASS RANKING SYSTEM ============");

        
        String[] studentNames = {"Ayesha", "Kevin", "Angelica", "ALdrich", "Alona"};
        double[][] rawQuizData = {
            {85.0, 90.0, 88.0, 92.0}, 
            {70.0, 75.0, 80.0, 78.0}, 
            {95.0, 92.0, 96.0, 94.0}, 
            {85.0, 90.0, 88.0, 93.0}, 
            {60.0, 65.0, 70.0, 68.0}  
        };

        Student[] students = new Student[studentNames.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(studentNames[i], rawQuizData[i]);
        }

        
        sortStudentsByAverage(students);

        
        System.out.println("RANK | STUDENT NAME       | AVERAGE SCORE");
        System.out.println("-----------------------------------------");
        
        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            
            if (i > 0 && students[i].average != students[i - 1].average) {
                currentRank = i + 1;
            }
            
            System.out.printf("%-4d | %-18s | %.2f%n", currentRank, students[i].name, students[i].average);
        }
        System.out.println("-----------------------------------------");

        
        String targetStudent = "Aldrich";
        int searchRank = linearSearchRank(students, targetStudent);
        if (searchRank != -1) {
            System.out.println("Linear Search Result: Si " + targetStudent + " ay nasa Rank " + searchRank + ".");
        } else {
            System.out.println("Linear Search Result: Hindi natagpuan ang estudyante.");
        }
        
        System.out.println("=============================================");
    }
}