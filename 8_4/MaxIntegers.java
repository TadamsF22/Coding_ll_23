public class MaxIntegers {

    public static void main(String[] args) {
        int num1 = 984797578, num2 = 546984876, num3 = 475878947;
        int max = 0;
       
        if (num1 > max) {
            max = num1; 
        }
       
        if (num2 > max) {
            max = num2; 
        }
       
        if (num3 > max) {
               max = num3;
        }
     

        System.out.println(" The max of 3 numbers is " + max);
    }

}
