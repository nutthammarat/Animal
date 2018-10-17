public class Pikachu extends Pichu {
    private String eggGroup;

    public String getEggGroup(){
        return eggGroup;
    }
    public void setEggGroup(String eggGroup) {
        this.eggGroup = eggGroup;
    }
    public void thunderbolt(){
        thunderShock();
        System.out.println("Egg " + eggGroup);
    }
}
