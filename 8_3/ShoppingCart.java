public class ShoppingCart {

    public static void main(String[] args) {
        try {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        double divResult = calc.divide(15, 0);
        System.out.println("Division Result: " + divResult);
    
        
            
        } catch (Exception e) {
           
        
            System.out.println(e);
        }
       System.out.println("yuh");

    }
}
