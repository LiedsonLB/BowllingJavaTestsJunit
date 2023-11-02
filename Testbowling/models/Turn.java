package Testbowling.models;

public class Turn {
    int turn1, turn2;

    public Turn(int turn1, int turn2){
        this.turn1 = turn1;
        this.turn2 = turn2;
    }

    public int getTurn1(){
        return turn1;
    }

    public int getTurn2(){
        return turn2;
    }

    public int getTurnScore(){
        if(turn1 == 10){
            
        }
        return turn1 + turn2;
    }

    // Strike
    public boolean isStrike(){
        if(turn1 == 10){
            return true;
        }
        return false;
    }

    // Spire
    public boolean isSpare(){
        if(turn1 + turn2 == 10 && turn1 != 10){
            return true;
        }
        return false;
    }
}
