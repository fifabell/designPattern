package Test;

public class TestA {
    private String Data1;
    private int Data2;

    public TestA(String Data1, int Data2){
        this.Data1 = Data1;
        this.Data2 = Data2;
    }

    public TestA CreateMemento()                    //Memento를 생성합니다 (상태저장) 
    {
        return new TestA(this.Data1,this.Data2);
    }

    public void RestorMemento(TestA testa)
    {
        this.Data1 = testa.get_Data1();
        this.Data2 = testa.get_Data2();
    }

    public void set_Data1(String Data1)
    {
        this.Data1 = Data1;
    }
    
    public void set_Data2(int Data2)
    {
        this.Data2 = Data2;
    }

    public String get_Data1()
    {
        return this.Data1;
    }

    public int get_Data2()
    {
        return this.Data2;
    }
}