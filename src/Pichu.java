public class Pichu extends Pokemon {
    private String thunderStoneType;
    private int electricPower;

    public String getThunderStoneType(){
        return thunderStoneType;
    }
    public void setThunderStoneType(String thunderStoneType) {
        this.thunderStoneType = thunderStoneType;
    }
    public int getElectricPower(){
        return electricPower;
    }
    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
    public void thunderShock(){
        System.out.println(getName() + " " + "Electrio");
        System.out.println("Thunder " + thunderStoneType);
        System.out.println("Power "+getPower());
        System.out.println("ElectricPower " + electricPower);
    }
}
