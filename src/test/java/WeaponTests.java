import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import player.weapons.*;

public class WeaponTests {
    private Weapon weapon = null;

    @Test
    public void weaponSuperClassTest() {
        weapon = new Weapon();
        final String expected = "You need to choose a weapon";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void automaticSubmachineGunTest() {
        weapon = new AutomaticSubmachineGun();
        final String expected = "The player fires an automatic submachine gun..";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void gunTest() {
        weapon = new Gun();
        final String expected = "The player fires a pistol..";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void rpgTest() {
        weapon = new RPG();
        final String expected = "The player fires an RPG..";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void slingshotTest() {
        weapon = new Slingshot();
        final String expected = "The player shoots with a slingshot..";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void waterGunTest() {
        weapon = new WaterGun();
        final String expected = "The player fires a water pistol..";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }
}
