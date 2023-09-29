//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell cell1 = new Cell("a1",false,5134);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4,cell1);
        bubba.display(false);
        cell1.setisOpen(5134);
    }
}
