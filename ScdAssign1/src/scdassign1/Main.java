package scdassign1;

public class Main {

    public static void main(String[] args) {
        
        // Dynamic or Runtime Polymorphism
        Flying flyingCar = new Car();
        flyingCar.fly();
        //Simple instantiation
        Flying airplane = new Airplane();
        airplane.fly();
         
    }
    
}
