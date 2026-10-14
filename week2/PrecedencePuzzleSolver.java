public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        System.out.println("=========== PRECEDENCE PUZZLE SOLVER ============");
        
        // PUZZLE 1
        // PREDICTED RESULT: true
        // Prefix ++x muna, ang x ay magiging 6, at ang value nito ay 6.
        // Arithmetic multiplication: 6 * 2 = 12.
        // Relational check: 12 > 10 ay true.
        // Logical AND: true && (5 < 10) -> true && true ay magiging true.
        int x = 5;
        boolean puzzle1Result = (++x * 2 > 10) && (x < 10);
        
        System.out.println("Puzzle 1 Actual Result : " + puzzle1Result);
        System.out.println("-------------------------------------------------");
        
        
        // PUZZLE 2
        // PREDICTED RESULT: false
        // Unang i-evaluate ang addition sa loob ng relational: 10 + 5 = 15.
        // Relational: 15 > 20 ay false.
        // Logical OR: false || (3 * 3 == 9) -> ang (9 == 9) ay true.
        // Dahil may OR (||), kung ang isang side ay true, ang buong resulta ay magiging true. 
        
        int a = 10;
        boolean puzzle2Result = a + 5 > 20 || (3 * 3 == 9);
        
        System.out.println("Puzzle 2 Actual Result : " + puzzle2Result);
        System.out.println("-------------------------------------------------");
        
        
        // PUZZLE 3 
        // PREDICTED RESULT: 16
        //Postfix y++ muna, gagamitin muna ang value na 8 para sa multiplication, kaya 8 * 2 = 16. 
        // Pagkatapos gamitin, saka magiging 9 ang y.
        int y = 8;
        int puzzle3Result = y++ * 2;
        
        System.out.println("Puzzle 3 Actual Result : " + puzzle3Result);
        System.out.println("=================================================");
        
        /*
         * - Ang mga unary increment/decrement operators (tulad ng ++ at --) ay mataas ang priority lalo na kung prefix.
         * - Ang arithmetic operators (*, /, %) ay laging nauuna kaysa sa relational operators (<, >, ==).
         * - Ang relational operators naman ay nauuna kaysa sa logical operators (&&, ||).
         * yun lang :)
         */
    }
}