package scdassign1;

public interface Vehical {
    
    default public void move(){
        System.out.println("This Vehical Moves Forward");
    }
    
    default public void Fly(){
        System.out.println("This Vehical flies");
    }
}
