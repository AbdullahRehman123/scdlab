package scdassign1;

public interface Flying {
    
    default public void fly(){
        System.out.println("This object is flying");
    }
    
}
