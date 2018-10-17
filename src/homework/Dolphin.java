package homework;

public class Dolphin extends Fish {
    public Organ o = new Organ();
    public String name;
    public String my_type = "Fish";

    public  String move(){

        return "hover swimming";
    }
    public  String eat(){

        return "seaweed";
    }
    public void hello(){
        System.out.println("Hello, my name is " + name + ". I am a " +
                my_type + ". I have " + o.getType() + ". I like " +
                move() + ". I eat " + eat() + ".");
    }
}
