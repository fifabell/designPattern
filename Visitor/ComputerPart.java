package Visitor;

// data 인터페이스
public interface ComputerPart {
    public void accept (ComputerPartVisitor computerPartVisitor);
}