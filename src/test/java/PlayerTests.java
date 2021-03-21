import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import player.Player;
import player.weapons.Weapon;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class PlayerTests {
    private static Player player;
    private static Weapon[] weapons;

    @BeforeAll
    public static void playerInit() {
        player = new Player();
        weapons = player.getWeapon();
    }

    //Hamcrest___________________________________________start
    @Test
    public void givenArray_whenChecksSize_thenCorrect() {
        assertThat(weapons, arrayWithSize(5));
    }

    @Test
    public void givenAListAndValues_whenChecksListForGivenValues_thenCorrect() {
        List<String> events = new ArrayList<>(9);
        for(Weapon weapon : weapons) {
            events.add(weapon.shot());
        }
        assertThat(events, containsInAnyOrder("The player fires an automatic submachine gun..",
                                                "The player fires a pistol..",
                                                "The player fires an RPG..",
                                                "The player shoots with a slingshot..",
                                                "The player fires a water pistol.."));
    }

    @Test
    public void shotWithGunTest() {
        final int origin = 1;
        final String expected = "The player fires a pistol..";
        final String result = player.shotWithWeapon(origin);
        assertThat(expected, equalToIgnoringWhiteSpace(result));
    }

    //Hamcrest___________________________________________end

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 6, 7})
    public void shotWithWeaponStartException(Integer arg){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            player.shotWithWeapon(arg);
        });
    }

    @Test
    public void shotWithWaterGunTest() {
        final int origin = 5;
        final String expected = "The player fires a water pistol..";
        final String result = player.shotWithWeapon(origin);
        Assertions.assertEquals(expected, result);
    }

}
