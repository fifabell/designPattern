package Test;

import java.util.Stack;

public class CareTaker {
    Stack<TestA> tA = new Stack<>();

    public void push(TestA testA)
    {
        tA.push(testA);
    }
    public TestA pop()
    {
        return tA.pop();
    }
}