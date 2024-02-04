@FunctionalInterface
public interface Flyable {
    

    void fly();
    
    default double getFlySpeed(){
        return 20;
    }
}
