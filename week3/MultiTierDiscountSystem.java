package week3;

public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        
        double purchaseAmount = 2500.00; // 
        double discountPercentage;
        
        if (purchaseAmount >= 5000.00) {
            discountPercentage = 0.15; 
        } else if (purchaseAmount >= 3000.00) {
            discountPercentage = 0.10; 
        } else if (purchaseAmount >= 1000.00) {
            discountPercentage = 0.05; 
        } else {
            discountPercentage = 0.00; 
        }
        
        double discountAmount = purchaseAmount * discountPercentage;
        double finalPrice = purchaseAmount - discountAmount;
        
        System.out.println("=========== MULTI-TIER DISCOUNT SYSTEM ===========");
        System.out.println("Purchase Amount     : ₱" + purchaseAmount);
        System.out.println("Assigned Discount   : " + (int)(discountPercentage * 100) + "%");
        System.out.println("Discount Savings    : ₱" + discountAmount);
        System.out.println("--------------------------------------------------");
        System.out.println("Final Discounted Price : ₱" + finalPrice);
        System.out.println("==================================================");
    }
}