public class Medic extends Hero{

    private int healPoints;
    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied super ability : " + getSuperAbility());
    }
    public void increaseExperience() {
        this.healPoints += (int) (this.healPoints * 0.1);
    }
}
