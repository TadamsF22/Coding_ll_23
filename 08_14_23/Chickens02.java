public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
       int totalEggs=0;
       int DailyAverage=0;
       int MonthlyAverage=0;
       double monthlyProfit=0;
       int totaldays= 0;
       //monday 
       totalEggs= totalEggs+ 100;
       totaldays ++;
       //tusday
       totalEggs = totalEggs+121;
       totaldays ++;
       //wenesday
       totalEggs = totalEggs+ 117;
       totaldays ++;
       //cal
       DailyAverage = totalEggs / totaldays;
       MonthlyAverage = (totalEggs*4)/(totaldays*4);
       monthlyProfit = MonthlyAverage * 0.18;

        System.out.println("Daily Average:   " +DailyAverage);
        System.out.println("Monthly Average: " +MonthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
