package Memento;

public class User {
    
    Information info;
    CareTaker caretaker;
    
    public void exe()
    {
        info  = new Information("Data1",10);            //Information 객체 생성
        caretaker = new CareTaker();                    //CareTaker 객체 생성
        //현재 Information의 상태 정보를 가지는 Memento를 생성하여 CareTaker에 추가합니다.
        caretaker.push(info.CreateMemento());
        
        //Information 정보를 수정합니다.                                                
        info.set_Data1("Data2");
        info.set_Data2(20);
        //현재 Information의 상태정보를 출력합니다.
        System.out.println("현재 Data1 : " + info.get_Data1());
        System.out.println("현재 Data2 : " + info.get_Data2());
        //가장 최근에 생성 된 Memento를 가지고와서 상태 정보를 복원합니다.
        info.RestorMemento(caretaker.pop());
        //상태 정보를 복원 한 후에 Information의 상태 정보를 출력합니다.
        System.out.println("복구된 Data1 : " + info.get_Data1());
        System.out.println("복구된 Data2 : " + info.get_Data2());
    }
}