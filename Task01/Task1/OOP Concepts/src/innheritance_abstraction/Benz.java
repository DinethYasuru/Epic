
package innheritance_abstraction;

public class Benz extends Car{
    public String unique="benz numberplate";
    
    public static void main(String[] args) {
        Benz benz = new Benz();
        System.out.println("A Benz car has "+ benz.no_of_tyres + "tyres");
        System.out.println("A Benz car has "+ benz.engine + "engine");

//        Abstraction
//        benz.engine_process();
    }
    
    public void showData(){
        System.out.println(unique);
        System.out.println(super.unique);
        System.out.println(super.no_of_tyres);
    }

    @Override
    public void engine_process() {
        super.engine_process();
        System.out.println("Show benz logo on the dash board");//To change body of generated methods, choose Tools | Templates.
    }
    
}
