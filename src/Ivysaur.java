
public class Ivysaur extends Bulbasaur{
    private String flowerColor;

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor =  flowerColor;
    }
    public void powerBeam() {
        bomb();
        System.out.println("Beam Beam " + flowerColor);
    }


}
