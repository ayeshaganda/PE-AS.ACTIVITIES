package week5;
import java.util.Arrays;
public class SearchAndSortMiniTool {
    public static void main(String[] args) {
        System.out.println("=========== SEARCH & SORT MINI-TOOL ============");
        
        int[] studentScores = {85, 92, 78, 60, 95, 88, 72, 90};
        
        
        System.out.print("Original Scores Array: ");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print(studentScores[i] + (i < studentScores.length - 1 ? ", " : ""));
        }
        System.out.println();
        
        int targetValue = 95;
        int foundIndex = -1;
        
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] == targetValue) {
                foundIndex = i;
                break; 
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Linear Search: Ang target value na " + targetValue + " ay natagpuan sa index " + foundIndex + ".");
        } else {
            System.out.println("Linear Search: Ang target value na " + targetValue + " ay hindi natagpuan.");
        }
        
        System.out.println("-------------------------------------------------");
        
        int[] sortedScores = Arrays.copyOf(studentScores, studentScores.length);
        Arrays.sort(sortedScores);
        
        System.out.print("Original Array pagkatapos i-copy : ");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print(studentScores[i] + (i < studentScores.length - 1 ? ", " : ""));
        }
        System.out.println();
        
        System.out.print("Sorted Copy ng Array             : ");
        for (int i = 0; i < sortedScores.length; i++) {
            System.out.print(sortedScores[i] + (i < sortedScores.length - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.println("=================================================");
        
        /*
         * - Mahalagang po i-sort ang sa copy kaysa na ang mismong original na array dahil 
         *   maraming beses na kailangan nating mapanatili ang original na pagkakasunod-sunod 
         *  ng data para sa iba pang bahagi ng programa o database. 
         * - Kung babaguhin natin ang original nang direkta, maaaring masira ang kaugnayan 
         *   ng mga data o mawala ang mga posisyon nito na kailangan pa sa ibang proseso.
         */
    }
}