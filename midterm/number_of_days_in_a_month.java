package Coding_ll_23.midterm;

public class number_of_days_in_a_month {
   public static void main(String[] args){
     int input_mounth= 3;
     int Input_year = 2016;
     int num_days = 0;
     if(Input_year%4== 0&& input_mounth ==2){
     num_days = 29;

     }else{
    if (input_mounth == 4 ||input_mounth == 6 ||input_mounth == 9 ||input_mounth == 11 ){
    num_days = 30;
 } else if(input_mounth == 1 ||input_mounth == 3 ||input_mounth == 5 ||input_mounth == 7||input_mounth == 8||input_mounth == 10||input_mounth == 12  ){
num_days = 31;

 }else{
    num_days =28;
 }
}
System.out.println("there are "+num_days+" days in the "+input_mounth+"th mounth of "+Input_year);
 
   

 
     

}  
}
