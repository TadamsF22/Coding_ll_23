
public class Card {
    private int currentCreditBalance;
    private int ticketBalance;
    private int cardnumber;
    private int toatlecards;
    
    public int getToatlecards() {
        return toatlecards;
    }

    public void setToatlecards(int toatlecards) {
        this.toatlecards = toatlecards;
    }

    public int getCurrentCreditBalance() {
        return currentCreditBalance;
    }

    public void setCurrentCreditBalance(int currentCreditBalance) {
        this.currentCreditBalance = currentCreditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Card(int balance, int ticketBalance){
     currentCreditBalance = balance;
     this.ticketBalance = ticketBalance;
    toatlecards+=1;
    cardnumber = toatlecards;
     }

    
}
