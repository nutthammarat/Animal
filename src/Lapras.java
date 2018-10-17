public class Lapras extends Pokemon{
    private int waterAbsorb;

    public int getWaterAbsorb(){
        return waterAbsorb;
    }
    public void setWaterAbsorb(int waterAbsorb){
        this.waterAbsorb = waterAbsorb;
    }
    public void shellArmor(){
        System.out.println(getName() + " " + getType());
    }
    public void hydrate(){
        System.out.println(getName() + " " + "Water");
        System.out.println("Hydrate " + waterAbsorb);
        System.out.println("Power " + getPower());
    }
}
