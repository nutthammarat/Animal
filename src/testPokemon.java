public class testPokemon {
    public static void main(String[] args) {
        Bulbasaur b = new Bulbasaur();
        b.setName("Fushigidane");
        b.setPower(120);
        b.setTackleDamange(3);
        b.bomb();
        System.out.println("-------------------------------------");
        Ivysaur i = new Ivysaur();
        i.setName("Fushigisou");
        i.setFlowerColor("red");
        i.setPower(350);
        i.setTackleDamange(5);
        i.powerBeam();
        System.out.println("-------------------------------------");
        Pichu p = new Pichu();
        p.setName("Pichujung");
        p.setElectricPower(20);
        p.setThunderStoneType("ruby");
        p.setPower(85);
        p.thunderShock();
        System.out.println("-------------------------------------");
        Pikachu pi = new Pikachu();
        pi.setEggGroup("fairy");
        pi.setName("Pika");
        pi.setPower(195);
        pi.setThunderStoneType("sapphire");
        pi.setElectricPower(35);
        pi.thunderbolt();
        System.out.println("-------------------------------------");
        Lapras l = new Lapras();
        l.setWaterAbsorb(5);
        l.setName("Laprasy");
        l.setPower(135);
        l.hydrate();
    }
}
