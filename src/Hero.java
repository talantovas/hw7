abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String SuperAbility;

    @Override
    public void applySuperAbility() {

    }
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        SuperAbility = superAbility;
    }
}
