package player.weapons;

public class Slingshot extends Weapon {
    @Override
    public String shot() {
        String event = "The player shoots with a slingshot..";
        System.out.println(event);
        return event;
    }
}
