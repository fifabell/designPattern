package Memento;

public class Information {
    private String Data1;                            //Information이 가지고 있는 데이터1
    private int Data2;                                //Information이 가지고 있는 데이터2
    public Information(String Data1, int Data2)        //생성자입니다.
    {
        this.Data1 = Data1;
        this.Data2 = Data2;
    }
    public Memento CreateMemento()                    //Memento를 생성합니다 (상태저장) 
    {
        return new Memento(this.Data1,this.Data2);
    }
    public void RestorMemento(Memento memento)         //Memento를 복원합니다 (상태복원)
    {
        this.Data1 = memento.getData1();
        this.Data2 = memento.getData2(); 
    }
    public void set_Data1(String Data1)                //데이터1의 값을 지정
    {
        this.Data1 = Data1;
    }
    public void set_Data2(int Data2)                //데이터2의 값을 지정
    {
        this.Data2 = Data2;
    }
    public String get_Data1()                        //데이터 1의 값 반환
    {
        return this.Data1;
    }
    public int get_Data2()                            //데이터 2의 값 반환
    {
        return this.Data2;
    }
}