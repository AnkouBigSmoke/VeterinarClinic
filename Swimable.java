@FunctionalInterface
public interface Swimable {
    

    void swim();
    
    default double getSwimSpeed(){
        return 7;
    }
}
