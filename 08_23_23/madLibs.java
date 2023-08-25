import javax.swing.JOptionPane;

public class madLibs {
    public static void main(String[] args) {
        
        String name1 = JOptionPane.showInputDialog("name ?");
        String object1 = JOptionPane.showInputDialog(" object1 ?");
        String object2 = JOptionPane.showInputDialog("  object2?");
        String place = JOptionPane.showInputDialog(" place ?");
        String Animal = JOptionPane.showInputDialog("animal ?");
        String action = JOptionPane.showInputDialog("action ?");
        
        

       
        // print strory
        JOptionPane.showMessageDialog(null,name1 + " And mr.gilmore set off on a adventure with "
         + object1 +" and "+ object2 +" in hand. On their way to \n" +place+" They incounter a big "+ Animal +
         " and mr.gilmore Slayed it with \n " + object1+
         " since "+name1+ " was to busy tring to eat "+object2+" \n after they made it to "+place+
         " they celibrated by "+action+
        " the end" );
       /*  System.out.println(name1 + " And mr.gilmore set off on a adventure with " + object1 +" "+ object2 +
        " in hand. On their way to " +place+" They incounter a big "+ Animal +
         " and mr.gilmore Slayed it with " + object1+
         " since "+name1+ " was to busy tring to eat "+object2+" after they made it to "+place+
         "they celibrated bye "+action+
        " the end");*/
        String  num = JOptionPane.showInputDialog("on a scale 1-10 how do you rate this ?");
        String  dub = JOptionPane.showInputDialog("pick a numb 0-1 ?");
        
        JOptionPane.showMessageDialog(null,(Integer.parseInt(num)*Double.parseDouble(dub)));

        
        
        
        
    }
}
