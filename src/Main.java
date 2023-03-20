public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];

        heroes[0] = new Magic(100, 50, "INVISIBILITY");
        heroes[1] = new Medic(150, 40, "HEALING", 20);
        heroes[2] = new Warrior(200, 60, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}