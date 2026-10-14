package week1;
public class ShoppingCalculator
  {
    public static void main(String[] args) {
        
        int quantity = 4;
        double unitPrice = 50.99;
        // THIS should not be declared as an int because unitPrice has decimal places (double). 

        String storeName = "Ayesha Ganda Store";
        double totalCost = quantity * unitPrice;

        System.out.println("========== SHOPPING RECEIPT ==========");
        System.out.println("Store Name : " + storeName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Unit Price : ₱" + unitPrice);
        System.out.println("--------------------------------------");
        System.out.println("Total Cost : ₱" + totalCost);
        System.out.println("======================================");
    }
}