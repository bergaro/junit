package player.weapons;

public class AutomaticSubmachineGun extends Weapon {
    @Override
    public String shot() {
        String event = "The player fires an automatic submachine gun..";
        System.out.println(event);
        return event;
    }
}
