package Decorator;

public class Cpu extends Computer {

    @Override
    public int getSpecScore(int score){
        return score * 4;
    }
}