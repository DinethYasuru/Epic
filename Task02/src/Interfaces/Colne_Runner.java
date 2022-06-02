package Interfaces;

public class Colne_Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone cl=new Clone(25,"Dineth");
        Clone cl2= (Clone) cl.clone();

        System.out.println(cl2.age+ cl2.clone().toString());
        System.out.println(cl2.name);

        Clone cl3= (Clone) cl2.clone();

        System.out.println(cl3.name+ cl3.clone().toString());
        System.out.println(cl3.age);
    }
}
