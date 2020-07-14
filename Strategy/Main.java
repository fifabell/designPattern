// template Method Pattern은 override 생각하면 됨.
// stratery Pattern은 interface를 통한 casting에 초점을 맞출 것.
//  OOP 5대 원칙 정리 할 것.

package Strategy;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        Fire fire = new Fire();
        Ice ice = new Ice();
        user1.setSkill(fire);
        user1.setSkill(ice);
    }
}