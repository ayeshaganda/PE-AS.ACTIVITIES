package week3;
public class NestedLoginValidator {
    public static void main(String[] args) {
        
        String inputUsername = "ayeeexaa";
        String inputPassword = "ayeshamaganda";
        boolean isAccountLocked = false; 
        
        System.out.println("=========== NESTED LOGIN VALIDATOR ============");
        System.out.println("Testing Username : " + inputUsername);
        System.out.println("Testing Password : " + inputPassword);
        System.out.println("Account Locked?  : " + isAccountLocked);
        System.out.println("-----------------------------------------------");
        
        if (inputUsername.equals("ayeeexaa")) {
            

            if (inputPassword.equals("ayeshamaganda")) {
                
               
                if (!isAccountLocked) {
                    System.out.println("Login Status: SUCCESS! Maligayang pagdating, Ayeeexaa!");
                } else {
                    
                    System.out.println("Login Status: FAILED. Ang iyong account ay LOCKED dahil sa maraming beses na maling pag-log in..");
                }
                
            } else {
                
                System.out.println("Login Status: FAILED. Mali yung password mo.");
            }
            
        } else {
            
            System.out.println("Login Status: FAILED. Hindi tugma ang username mo.");
        }
        
        System.out.println("===============================================");
    }
}