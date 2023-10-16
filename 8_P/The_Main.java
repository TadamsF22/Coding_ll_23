public class The_Main {
    public static void main(String[] args) {
        Teams team1 = new Teams("goobers",0,0,0,0,0);
        Teams team2 = new Teams("yehas",0,0,0,0,0);
        Teams team3 = new Teams("doc",0,0,0,0,0);
        Teams team4 = new Teams("jacob",0,0,0,0,0);
        Games gameT = new Games(0,0);
        
        System.out.println(gameT.getHome_score());


    }
}
