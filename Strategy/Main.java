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