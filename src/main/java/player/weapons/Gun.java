package player.weapons;

public class Gun extends Weapon {
    @Override
    public String shot() {
        String event = "The player fires a pistol..";
        System.out.println(event);
        return event;
    }
}
