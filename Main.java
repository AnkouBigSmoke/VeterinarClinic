import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Animals cat = new Animals("Solnishko", new Owner("Serghei Ivanovich"), LocalDate.of(2021, 4, 16), new Illness("Boleet"));
        
        // System.out.println(cat.gertowner());
        // System.out.println(cat.gertnickname());

        // Animals testAnimal = new Animals();
        // System.out.println(testAnimal.gertnickname());

        // cat.lifeCycle();
        // System.out.println(cat.gettype());

        // System.out.println(cat);

        Cat catty = new Cat();
        System.out.println(catty.gettype());
        catty.lifeCycle();

        Dog goodDog = new Dog();
        System.out.println(goodDog.gettype());
        goodDog.lifeCycle();

        Fish boby = new Fish();
        System.out.println(boby.gettype());
        boby.lifeCycle();

        Bird kesha = new Bird();
        System.out.println(kesha.gettype());
        kesha.lifeCycle();


    }
}