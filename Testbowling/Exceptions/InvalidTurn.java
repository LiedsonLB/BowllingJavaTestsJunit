package Testbowling.Exceptions;

public class InvalidTurn extends Exception{
    public InvalidTurn(){
        super("Jogada Invalida, numero de pinos acima do limite");
    }
}
