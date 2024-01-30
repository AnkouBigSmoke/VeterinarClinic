import java.time.LocalDate;

public class Animals {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animals(String nickname, Owner owner, LocalDate birthDate, Illness illness){
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animals(){
        this("Klichka", new Owner("Hozeain"), LocalDate.now(), new Illness("Boleet")); //Konstructor po umolchaniu
    }

    public String gertnickname(){
        return nickname;
    }

    public Owner gertowner(){
        return owner;
    }

    public LocalDate getbirDate(){
        return birthDate;
    }

    public Illness getIllness(){
        return illness;
    }

    public void setIllness(Illness illness){
        this.illness = illness;
    }

    // private void wakeup(){
    //     System.out.println("Animal wake up");
    // }

    private void wakeup(String time){
        System.out.println("Animal wake up on " + time);
    }

    private void hunt(){
        System.out.println("Animal hunt");
    }

    private void eat(){
        System.out.println("Animal eat");
    }

    private void sleep(){
        System.out.println("Animal sleep");
    }

    public void lifeCycleMorning(){
        wakeup("12:00");
        hunt();
        eat();
    }

    public void lifeCycleEvening(){
        eat();
        sleep();
    }

    public String gettype(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("nickname = %s, bd = %s, owner = %s, illnes = %s", nickname, birthDate, owner, illness);
        
    }

}
