public class PrisonTest {
    public static void main(String[] args){
        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.Height = "6\'10\"";
        bubba.Sentence = 4;

        Prisoner twitch = new Prisoner();
         twitch.name = "bubba";
        twitch.Height = "6\'10\"";
        twitch.Sentence = 4;

        boolean l = twitch == bubba;
        System.out.println(l);


    }
    
}
