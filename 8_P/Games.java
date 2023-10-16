import java.util.Random;


  

public class Games {
    private int home_score = 0;
    private int away_score = 0;
    private int temp = 50;
    
//constructot
    public Games(int home_score,int away_score){
        this.away_score = away_score;
        this.home_score = home_score;
         Random random = new Random();
    int listSize = Teams.teams.size();
    int home = random.nextInt(listSize);
    int away = random.nextInt(listSize);
     while(home ==  away){
        away = random.nextInt(listSize);
    }
        if(temp < 30){
            home_score = random.nextInt(4);
            away_score = random.nextInt(4);
        }else{
             home_score = random.nextInt(9);
            away_score = random.nextInt(9);
        }
        this.away_score = away_score;
        this.home_score = home_score;


    
     
    }
     public int getHome_score() {
        return home_score;
    }

    public void setHome_score(int home_score) {
        this.home_score = home_score;
    }

    public int getAway_score() {
        return away_score;
    }

    public void setAway_score(int away_score) {
        this.away_score = away_score;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }



   /*  public void play_game () {
       
    if(home ==  away){
        away = random.nextInt(listSize);
    }else{
        if(temp < 30){
            home_score = random.nextInt(4);
            away_score = random.nextInt(4);
        }else{
             home_score = random.nextInt(9);
            away_score = random.nextInt(9);
        }

    }
}*/

    
   
        


    }
    
    

