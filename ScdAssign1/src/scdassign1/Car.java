package scdassign1;

public class Car implements Vehical,Flying {
    
    @Override //interface Vehical
    public void move(){
        System.out.println("This Car moves forward");  
    }
    
    @Override // interface Vehical
    public void Fly(){
        System.out.println("This Car flies");
    }
    
    @Override // interface Flying
    public void fly(){
        System.out.println("This Car is flying");
    }
}
