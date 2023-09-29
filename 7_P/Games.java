import java.util.Random;
public class Games {
    public void play(Card card){
        if (card.getCurrentCreditBalance() < 2 ){
            System.out.println("you do not have enuogh creidits to play this game");
        }else{ 
            Random rand =  random.nextInt(3,100);
           card.setTicketBalance(rand);
        }
    
 }
}
