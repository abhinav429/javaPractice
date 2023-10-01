abstract class Plane{
abstract public void takeOff();
abstract public void des();
}
class PassPlane extends Plane{
    public void takeOff(){
        System.out.println("Pass takeoff");
    }
    public void random(){
        System.out.println("RANDOM");
    }
    public void des(){
        System.out.println("passplane");
    }
}
class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo takeoff");
    }
    public void des(){
        System.out.println("cargoplane");
    }
}
class Airport{
    public void poly(Plane ref){
        ref.takeOff();
        ref.des();
        System.out.println("-----------------------------------");
    }
}
public class Inherit {
    public static void main(String args[]){
        PassPlane pp=new PassPlane();
        Plane cp=new CargoPlane();
        // Airport a=new Airport();  
        // a.poly(pp);
        // a.poly(cp);
        pp.takeOff();
        cp.takeOff();
        pp.random();

        

    }
}
