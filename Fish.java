import java.time.LocalDate;

public class Fish extends Animals {

    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness illness){
        super(nickname, owner, birthDate, illness);
    }
    
    public Fish(){
        super();
    }

    private void swim(){
        System.out.println("Animal swiming");
    }

    public void lifeCycle(){
        lifeCycleMorning();
        swim();
        lifeCycleEvening();
    }
}
