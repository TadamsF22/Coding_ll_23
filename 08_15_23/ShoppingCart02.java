public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "  + itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price =5.00;
        double tax =0.05;
        int quantity = 20;
        double totalPrice = (price * quantity) *( 1+tax) ;
        
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        message =custName+" wants to purchase a " + quantity +" " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
         System.out.println(totalPrice);
        
    }    
}
