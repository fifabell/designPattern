package Decorator;

public class Main {
    public static void main(String[] args) {
        Computer cpu = new Computer();
        int c = cpu.Computer();
        
        Computer gpuDeco = new Cpu(c);
        // gpuDeco.getSpecScore(cpu);



    }
}