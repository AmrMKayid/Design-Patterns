package IntroToDesignPatterns.DesignPuzzle;

public class ActionAdventureSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();

        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}
