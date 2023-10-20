public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic();
        heroes[1] = new Medic();
        heroes[2] = new Warrior();

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            System.out.println(hero.SuperAbility);
        }
    }
}