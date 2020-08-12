package Interpreter;

public interface Expression {
    // context 매개변수를 포함하고있는 boolean type의 interpret 함수.
    public boolean interpret(String context);
}