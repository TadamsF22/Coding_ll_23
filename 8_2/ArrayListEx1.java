import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("amy");
        students.add("bob");
        students.add("cindy");
        students.add("david");
        students.add(0,"nick");
        students.add(1,"mike");
        students.remove(3);
        



       System.out.println(students);
        System.out.println(students.size());
        
        
    }
    
}
