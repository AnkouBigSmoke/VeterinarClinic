import java.time.LocalDate;

public class Dog extends Animals {

    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness){
        super(nickname, owner, birthDate, illness);
    }
    
    public Dog(){
        super();
    }

    private void run(){
        System.out.println("Animal runing");
    }

    public void lifeCycle(){
        lifeCycleMorning();
        run();
        lifeCycleEvening();
    }
}
