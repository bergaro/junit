package player.weapons;

public class RPG extends Weapon {
    @Override
    public String shot() {
        String event = "The player fires an RPG..";
        System.out.println(event);
        return event;
    }
}
