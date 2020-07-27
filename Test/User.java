package Test;

public class User {
    TestA tA;
    CareTaker ct;
    public void exe()
    {
        tA = new TestA("Data1", 10);
        ct = new CareTaker();

        ct.push(tA.CreateMemento());

        tA.set_Data1("Data2");
        tA.set_Data2(20);

        System.out.println("현재 데이터1:"+tA.get_Data1());
        System.out.println("현재 데이터2:"+tA.get_Data2());

        tA.RestorMemento(ct.pop());

        System.out.println("복구된 데이터1:"+tA.get_Data1());
        System.out.println("복구된 데이터2:"+tA.get_Data2());
    }
}