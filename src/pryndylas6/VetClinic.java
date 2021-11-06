package pryndylas6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {

        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мяско", "Будка, но не в квартірі");
        animals[1] = new Horse("Травка", "Конюшня" ,2.8);
        animals[2] = new Cat("Миші", "Там де вони є");

        for (Animal animal : animals) { veterinarian.treatAnimal(animal); }

            // public static class Main {
          //  public static void main(String[] args) throws Exception{
            //    Veterinarian v = new Veterinarian();
             //   Class clazz = v.getClass();
             //   System.out.println(clazz.getName());
            //    Class vetClazz = Class.forName("com.pb.pryndylas6.Veterinarian");
            //    Constructor constructor = vetClazz.getConstructor(new Class[] {String.class});
             //   Object obj = constructor.newInstance("Доктор Еммет Браун");
            //    if (obj instanceof Veterinarian) {
//                }
        //    }
   // }




}}
