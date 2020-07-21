package Decorator;

public class PerformUp extends Computer{
    int getPerform = perform;
    
    public int setCpu(int getPerform){
        return getPerform * 4;
    }

    public int setGpu(int getPerform){
        return getPerform * 2;
    }
}