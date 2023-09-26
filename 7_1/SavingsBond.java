public class SavingsBond {
    public int term;
    public double intr;
    public double purchseprice;
    public SavingsBond(int userterm ,double amount){
        term = userterm;
        purchseprice = amount;
        
        if (term < 12 ){
            intr = 0.005;
        }
        else if (term>= 12 && term < 24){
            intr = 0.01;
        }
        else if (term>= 24 && term < 36){
            intr = 0.015;
        }
        else if (term>= 36 && term < 48){
            intr = 0.02;
        }
        else if (term>= 48 && term < 60){
            intr = 0.025;
        }
        else{
            intr = 0;
            System.out.println("invald");
        }
     double total = amount*Math.pow((1+ intr),term);
     System.out.println(total);

 




    }
}
