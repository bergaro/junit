package player;

import player.weapons.*;

public class Player {
    //Арсенал игрока-1
    private Weapon[] weaponSlots;

    //Добавляем в арсенал новое оружие
    public  Player() {
        weaponSlots = new Weapon[] {
                new Gun(),
                new AutomaticSubmachineGun(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }
    //Размер арсенала игрока
    public int getSlotsCount() {
        return weaponSlots.length;
    }
    //Считаю что пользователь выбирает слоты с 1, а не с 0.
    public String shotWithWeapon(int slot) {
        String message;
        if(slot > getSlotsCount() || slot <= 0) throw new IllegalArgumentException("Произведён выход за длину массива");
        Weapon weapon = weaponSlots[slot-1];
        message = weapon.shot();
        return message;
    }
}
