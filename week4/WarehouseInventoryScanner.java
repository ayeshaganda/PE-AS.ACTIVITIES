package week4;
public class WarehouseInventoryScanner 
{
    
    
    public static void simulateRestocking(int currentStock) {
        int addedStock = 50;
 
        while (addedStock > 0) {
            currentStock += addedStock;
            System.out.println("Restocking successful! New stock count: " + currentStock);
            return; }
    }

    public static void main(String[] args) {



        System.out.println("=========== WAREHOUSE INVENTORY SCANNER ============");
        
       
        int[][] warehouseGrid = {
            {45, 12, 80},
            {5, -1, 30},   
            {95, 105, 15}
        };
        
        int choice = 2; 
        
       
        do {
            System.out.println("\n[MENU SYSTEM]");
            System.out.println("1. Scan Inventory");
            System.out.println("2. Exit Menu");
            System.out.println("Piling aksyon: " + choice);
            
            if (choice == 2) {
                System.out.println("Lumabas sa menu...");
                break;
            }
        } while (choice != 2);
        
        System.out.println("-----------------------------------------------------");
        
        
        int totalInventory = 0;
        for (int r = 0; r < warehouseGrid.length; r++) {
            for (int c = 0; c < warehouseGrid[r].length; c++) {
                
                if (warehouseGrid[r][c] == -1) {
                    continue; 
                }
                totalInventory += warehouseGrid[r][c];
            }
        }
        System.out.println("Total Inventory (excluding damaged shelves): " + totalInventory);
        System.out.println("-----------------------------------------------------");
        
        
        int criticalRow = -1;
        int criticalCol = -1;
        boolean foundCritical = false;
        
        for (int r = 0; r < warehouseGrid.length; r++) {
            for (int c = 0; c < warehouseGrid[r].length; c++) {
                
                if (warehouseGrid[r][c] != -1 && warehouseGrid[r][c] < 10) {
                    criticalRow = r;
                    criticalCol = c;
                    foundCritical = true;
                    break; 
                }
            }
            if (foundCritical) {
                break; 
            }
        }
        
        if (foundCritical) {
            System.out.println("Unang Critically Low Shelf natagpuan sa Row " + criticalRow + ", Col " + criticalCol);
            System.out.println("Kasalukuyang items sa shelf na ito: " + warehouseGrid[criticalRow][criticalCol]);
            
           
            simulateRestocking(warehouseGrid[criticalRow][criticalCol]);
        } else {
            System.out.println("Walang critically low shelf na natagpuan.");
        }
        
        System.out.println("=====================================================");
    }
}