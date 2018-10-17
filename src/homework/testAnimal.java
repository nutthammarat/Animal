package homework;

import java.util.*;

public class testAnimal {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i=0;i<n;i++){
           gettype(kb.next(),kb.next());
        }
    }



    static void gettype(String x,String y){
        if(x.equals("Duck")){
            getDuck(y);
        }
        if(x.equals("Chicken")){
            getChicken(y);
        }
        if(x.equals("Parrot")){
            getParrot(y);
        }
        if(x.equals("Shark")){
            getShark(y);
        }
        if(x.equals("Ray")){
            getRay(y);
        }
        if(x.equals("Dolphin")){
            getDolphin(y);
        }

    }
    static void  getDuck(String y){
            Duck d = new Duck();
            d.o.setType("wings");
            // System.out.println(o.getType());
            d.name = y;
            d.hello();
        }
    static void  getChicken(String y){
        Chicken c = new Chicken();
        c.o.setType("wings");
        c.name = y;
        c.hello();
    }
    static void  getParrot(String y){
        Parrot p = new Parrot();
        p.o.setType("wings");
        p.name = y;
        p.hello();
    }
    static void  getShark(String y){
        Shark s = new Shark();
        s.o.setType("fins");
        s.name = y;
        s.hello();
    }
    static void  getRay(String y){
        Ray r = new Ray();
        r. o.setType("fins");
        r.name = y;
        r.hello();
    }
    static void  getDolphin(String y){
        Dolphin dol = new Dolphin();
        dol.o.setType("fins");
        dol.name = y;
        dol.hello();
    }
}



