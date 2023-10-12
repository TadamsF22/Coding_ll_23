import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
         
        Iterator<Integer> ir= numbers.iterator();
        int num;
        while (ir.hasNext()) {
            
            num= ir.next();
            System.out.println(num);
            if(num%2==0){
                ir.remove();
            }
           
            
            }
             System.out.println(numbers);
        
        
        
        
        
         
    }
}
