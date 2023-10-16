import java.util.ArrayList;

public class Teams {
    private String name;
    private int goals;
    private int wins;
    private int goals_allowed;
    private int loss;
    private int tie;
    

    public static ArrayList<Teams> teams = new ArrayList<Teams>();

    public Teams(String name, int goals, int wins,int goals_allowed,int loss, int tie){
        this.name = name;
        this.wins = wins;
        this.goals = goals_allowed;
        this.goals_allowed= goals_allowed;
        this.loss = loss;
        this.tie = tie;
        teams.add(this);
    }
    
    public int getLoss() {
        return loss;
    }



    public void setLoss(int loss) {
        this.loss = loss;
    }



    public int getTie() {
        return tie;
    }



    public void setTie(int tie) {
        this.tie = tie;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGoals_allowed() {
        return goals_allowed;
    }

    public void setGoals_allowed(int goals_allowed) {
        this.goals_allowed = goals_allowed;
    }

    
}
