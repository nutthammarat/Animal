package homework;

public class Parrot extends Poultry {
    public Organ o = new Organ();
    public String name;
    public String my_type = "Poultry";

    public  String move(){

        return "speaking";
    }
    public  String eat(){

        return "bean";
    }
    public void hello(){
        System.out.println("Hello, my name is " + name + ". I am a " +
                my_type + ". I have " + o.getType() + ". I like " +
                move() + ". I eat " + eat() + ".");
    }
}
