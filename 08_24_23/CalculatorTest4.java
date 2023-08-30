public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double total = 0;
        //Name your friends
       total += calc.findTotal(10, "doc");

        total += calc.findTotal(12, "jacob");
        total += calc.findTotal(9,  "me");
        total += calc.findTotal(8,  "adam");
        total += calc.findTotal(7,  "jake");
        total += calc.findTotal(15, "Alex");
        total += calc.findTotal(11, "gabe");
        total += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        System.out.println(total);

       
    } 
}
