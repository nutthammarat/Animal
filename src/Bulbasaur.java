
public class Bulbasaur extends Pokemon {
    private int tackleDamange;

    public int getTackleDamange() {
        return tackleDamange;
    }
    public void setTackleDamange(int tackleDamange) {
        this.tackleDamange = tackleDamange;
    }
    public void bomb() {
        System.out.println(getName() + " " + "Grass");
        System.out.println("Bomb power " + getPower());
        System.out.println("Damage " + tackleDamange);
    }
    public void powerWhip() {
        bomb();
    }


}
