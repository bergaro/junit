package player.weapons;

public class WaterGun extends Weapon {
    @Override
    public String shot() {
        String event = "The player fires a water pistol..";
        System.out.println(event);
        return event;
    }
}
