public class AtmTransactionAuthorizer {
    public static void main(String[] args) {
       
        String inputUsername = "ayesha1122";
        int inputPin = 1122;
        
        double accountBalance = 5000.00; 
        double withdrawalAmount = 3500.00; 
        
        String accountTier; 
        double transactionFeePercentage;
        boolean isAuthorized = false;
        String denialReason = "";
        
        System.out.println("=========== ATM TRANSACTION AUTHORIZER ===========");
        
        
        if (inputUsername.equals("ayesha1122")) {
            
            if (inputPin == 1122) {
                
                
                if (accountBalance >= 500000.00) {
                    accountTier = "Platinum";
                } else if (accountBalance >= 30000.00) {
                    accountTier = "Gold";
                } else if (accountBalance >= 10000.00) {
                    accountTier = "Silver";
                } else {
                    accountTier = "Bronze";
                }
                
                System.out.println("Login Status    : SUCCESS");
                System.out.println("Account Tier    : " + accountTier);
                System.out.println("Account Balance : ₱" + accountBalance);
                System.out.println("Withdrawal Req  : ₱" + withdrawalAmount);
                System.out.println("--------------------------------------------------");
                
                
                transactionFeePercentage = switch (accountTier) {
                    case "Platinum" -> 0.00;
                    case "Gold" -> 0.005;
                    case "Silver" -> 0.01;
                    case "Bronze" -> 0.02;
                    default -> 0.02;
                };
                
                
                double transactionFee = withdrawalAmount * transactionFeePercentage;
                double totalDeduction = withdrawalAmount + transactionFee;
                
                
                double dailyLimit = 0.0;
                switch (accountTier) {
                    case "Platinum" -> dailyLimit = 50000.00;
                    case "Gold" -> dailyLimit = 30000.00;
                    case "Silver" -> dailyLimit = 15000.00;
                    case "Bronze" -> dailyLimit = 5000.00;
                }
                
                
                if (withdrawalAmount <= dailyLimit) {
                    
                    if (accountBalance >= totalDeduction) {
                        isAuthorized = true;
                    } else {
                        denialReason = "DENIED: Hindi sapat ang balance mo (kasama ang transaction fee na ₱" + transactionFee + ").";
                    }
                    
                } else {
                    denialReason = "DENIED: Lumagpas ang gustong i-withdraw sa daily limit ng tier mo (Limit: ₱" + dailyLimit + ").";
                }
                
                
                if (isAuthorized) {
                    double finalBalance = accountBalance - totalDeduction;
                    System.out.println("TRANSACTION STATUS : APPROVED");
                    System.out.println("Transaction Fee    : ₱" + transactionFee);
                    System.out.println("New Balance        : ₱" + finalBalance);
                } else {
                    System.out.println("TRANSACTION STATUS : DENIED");
                    System.out.println("Reason             : " + denialReason);
                }
                
            } else {
                System.out.println("Transaction Denied: Maling 4-digit PIN.");
            }
            
        } else {
            System.out.println("Transaction Denied: Hindi rehistradong username.");
        }
        
        System.out.println("==================================================");
    }
}