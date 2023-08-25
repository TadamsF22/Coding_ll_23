public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double Person1 = (10 * 1.05)*1.15;
        double Person2 = (12 * 1.05)*1.15;
        double Person3 = (9 * 1.05)*1.15;
        double Person4 = (8 * 1.05)*1.15;
        double Person5 = (7 * 1.05)*1.15;
        double Person6 = (15 * 1.05)*1.15;
        double Person7 = (11 * 1.05)*1.15;
        double Person8 = (30 * 1.05)*1.15;

        System.out.println("person1: "+((int)Person1));
        System.out.println("person2: "+Person2);
        System.out.println("person3: "+Person3);
        System.out.println("person4: "+Person4);
        System.out.println("person5: "+Person5);
        System.out.println("person6: "+Person6);
        System.out.println("person7: "+Person7);
        System.out.println("person8: "+Person8);

        
    }    
}
