package Testbowling.models;

import Testbowling.Exceptions.InvalidTurn;

public class Game {
    private static int[] scoreBoard = new int[11];
    private static Turn[] roudsPrayer = new Turn[11];
    private int roudCurr;
    private int resultScoreBoard;

    // Game
    public Game(){
        this.roudCurr = 0;
        this.resultScoreBoard = 0;
    }

    // Verifica se a pontuação está zerada
    public boolean isEmpty(){
        for(int i = 0; i < 10; i++){
            if(scoreBoard[i] != 0){
                return false;
            }
        }
        return true;
    }

    // Adiciona a jogada
    public void add(Turn turnCurrent) throws InvalidTurn {
        // verifica se a jogada é invalida e lança uma exception
        if (turnCurrent.getTurnScore() > 10 && roudCurr != 9) {
            throw new InvalidTurn();
        }
    
        // adiciona jogada ao scoreboard
        roudsPrayer[roudCurr] = turnCurrent;
        scoreBoard[roudCurr] = turnCurrent.getTurnScore();

        // Verifica Strike seguido de Strike na 10ª rodada
        if (roudCurr == 9) {
            if (roudCurr > 0 && roudsPrayer[roudCurr - 1].turn1 == 10) {
                scoreBoard[roudCurr - 1] += turnCurrent.getTurnScore();
                if (turnCurrent.isStrike() && roudCurr > 1 && roudsPrayer[roudCurr - 2].turn1 == 10) {
                    scoreBoard[roudCurr - 2] += turnCurrent.getTurn1();
                    if (turnCurrent.isStrike() && roudCurr > 2 && roudsPrayer[roudCurr - 3].turn1 == 10) {
                        scoreBoard[roudCurr - 3] += turnCurrent.getTurn1();
                    }
                }
            }
        }
        
        // verifica Strike seguido de Strike
        if (roudCurr > 1 && roudsPrayer[roudCurr - 2].turn1 == 10 && roudsPrayer[roudCurr - 1].turn1 == 10) {
            scoreBoard[roudCurr - 2] += turnCurrent.getTurnScore();
        }

        // verifica Strike normal
        if (roudCurr > 0 && roudsPrayer[roudCurr - 1].turn1 == 10) {
            scoreBoard[roudCurr - 1] += turnCurrent.getTurnScore();
        }
    
        // verifica Spire
        if (roudCurr > 0 && roudsPrayer[roudCurr - 1].turn1 + roudsPrayer[roudCurr - 1].turn2 == 10 && roudsPrayer[roudCurr - 1].turn1 != 10) {
            scoreBoard[roudCurr - 1] += turnCurrent.getTurn1();
        }

        // verifica se é a ultima rodada e concede o bônus de spire
        if(roudCurr == 9) {
            if (roudCurr > 0 && roudsPrayer[roudCurr - 1].isSpare()) {
                scoreBoard[roudCurr] += turnCurrent.getTurn1();
            }
        }
    
        // proxima rodada
        roudCurr++;
    
        // Verifica se já acabou as 10 rodadas e soma a pontuação
        if (roudCurr == 10) {
            for (int i = 0; i < 10; i++) {
                resultScoreBoard += scoreBoard[i];
                System.out.println("Rodada " + (i + 1) + ": " + resultScoreBoard);
            }
            System.out.println("pontuação final: " + resultScoreBoard);
        }
    }

    public int getResultScoreBoard(){
        return resultScoreBoard;
    }

    public int getRoudCurr(){
        return roudCurr;
    }
}
