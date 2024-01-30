import java.time.LocalDate;

public class Cat extends Animals {

    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount){
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat(){
        super();
        this.discount = 10D;
    }

    public Double getDiscount(){
        return discount;
    }

    public void setDiscount(Double discount){
        this.discount = discount;
    }

    @Override
    public String toString(){
        return super.toString() + "Discount (" + discount + ")";
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
