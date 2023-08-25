public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds79yijkjlk";
       /*
       Double.parseDouble(shirtPrice * taxRate);
        Double.parseDouble(taxRate);
        Integer.parseInt(shirtPrice);
        */
        System.out.println( Double.parseDouble(taxRate)*
        Integer.parseInt(shirtPrice));


        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
