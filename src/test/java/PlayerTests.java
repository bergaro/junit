import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import player.Player;

public class PlayerTests {
    private static Player player;

    @BeforeAll
    public static void playerInit() {
        player = new Player();
    }

    @Test
    public void numberWeaponsPlayerHasTest() {
        final int expected = 5;
        final int result = player.getSlotsCount();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shotWithWeaponStartException(){
        final int origin = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            player.shotWithWeapon(origin);
        });
    }

    @Test
    public void shotWithWeaponEndException(){
        final int origin = 6;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            player.shotWithWeapon(origin);
        });
    }

    @Test
    public void shotWithGunTest() {
        final int origin = 1;
        final String expected = "The player fires a pistol..";
        final String result = player.shotWithWeapon(origin);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shotWithWaterGunTest() {
        final int origin = 5;
        final String expected = "The player fires a water pistol..";
        final String result = player.shotWithWeapon(origin);
        Assertions.assertEquals(expected, result);
    }

}
