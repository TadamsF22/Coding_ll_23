public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
       int eggsperchicken = 4;
       int chickencount = 8 ;
       int totalEggs = 0;
       //day 1
       totalEggs =chickencount * eggsperchicken;
       //day 2
       chickencount = chickencount + 1;
       totalEggs += chickencount * eggsperchicken;
       //day 3
       chickencount = chickencount / 2;
       totalEggs += eggsperchicken * chickencount;
       System.out.println(totalEggs);
        
        System.out.println(totalEggs);
    }   
}
