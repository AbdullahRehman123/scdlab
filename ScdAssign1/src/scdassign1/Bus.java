package scdassign1;

public class Bus implements Vehical{
    
    @Override
    public void move(){
        System.out.println("This Bus moves forward");  
    }
    
    @Override
    public void Fly(){
        System.out.println("This Bus flies");
    }
}
