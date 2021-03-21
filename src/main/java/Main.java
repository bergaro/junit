import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int slot;
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти%n", player.getSlotsCount());
        while(true) {
            slot = scanner.nextInt();
            if(slot != -1) {
                player.shotWithWeapon(slot);
            } else {
                System.out.println("Game over!");
                break;
            }
        }
    }
}
