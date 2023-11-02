package Testbowling.models;

public class Round {
    Turn turnPlayer;

    Round(Turn turnPlayer){
        this.turnPlayer = turnPlayer;
    }

    // Strike
    public boolean isStrike(){
        if(turnPlayer.getTurn1() == 10){
            return true;
        }
        return false;
    }

    // Spire
    public boolean isSpare(){
        if(turnPlayer.getTurn1() + turnPlayer.getTurn2() == 10){
            return true;
        }
        return false;
    }
}
