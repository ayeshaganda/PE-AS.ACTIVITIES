package week5;
public class FavoriteThingsArray {
    public static void main(String[] args) {
        System.out.println("=========== FAVORITE THINGS ARRAY ============");
        
       
        String[] favoriteThings = {
            "Coffee", 
            "Writing Stories", 
            "Reading Books", 
            "Listening to Music", 
            "Sunset Viewing"
        };
        
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Total length of the array: " + favoriteThings.length);
        System.out.println("==============================================");
    }
}