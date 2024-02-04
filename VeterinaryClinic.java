import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Goable> runningAnimals;
    private List<Swimable> swimmingAnimals;
    private List<Flyable> flyingAnimals;
    private List<Doctor> doctors;

    public VeterinaryClinic() {
        runningAnimals = new ArrayList<>();
        swimmingAnimals = new ArrayList<>();
        flyingAnimals = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    // Методы для добавления животных и врачей в клинику
    public void addRunningAnimal(Goable animal) {
        runningAnimals.add(animal);
    }

    public void addSwimmingAnimal(Swimable animal) {
        swimmingAnimals.add(animal);
    }

    public void addFlyingAnimal(Flyable animal) {
        flyingAnimals.add(animal);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Методы для получения всех бегающих, плавающих и летающих
    public List<Goable> getAllRunningAnimals() {
        return new ArrayList<>(runningAnimals);
    }

    public List<Swimable> getAllSwimmingAnimals() {
        return new ArrayList<>(swimmingAnimals);
    }

    public List<Flyable> getAllFlyingAnimals() {
        return new ArrayList<>(flyingAnimals);
    }

    // Дополнительные методы для работы с врачами
    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctors);
    }

    // Другие методы работы с клиникой

    // Пример использования
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление животных и врачей
        clinic.addRunningAnimal(new Cat("Fluffy", new Owner("John Doe"), LocalDate.now(), new Illness("Cough"), 15.0));
        clinic.addSwimmingAnimal(new Fish("Goldie", new Owner("Jane Doe"), LocalDate.now(), new Illness("Fin Rot")));
        clinic.addFlyingAnimal(new Bird("Tweety", new Owner("Tom Smith"), LocalDate.now(), new Illness("Cold")));

        clinic.addDoctor(new Doctor("Dr. Smith"));

        // Получение всех бегающих и врачей
        List<Goable> runningAnimals = clinic.getAllRunningAnimals();
        List<Doctor> doctors = clinic.getAllDoctors();

        // Дополнительная обработка данных
        for (Goable animal : runningAnimals) {
            animal.go();
        }

        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
