import java.time.LocalDate;

public class Bird extends Animals {

    public Bird(String nickname, Owner owner, LocalDate birthDate, Illness illness){
        super(nickname, owner, birthDate, illness);
    }
    
    public Bird(){
        super();
    }

    private void fly(){
        System.out.println("Animal flying");
    }

    public void lifeCycle(){
        lifeCycleMorning();
        fly();
        lifeCycleEvening();
    }
}
