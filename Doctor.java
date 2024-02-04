public class Doctor {

    String fullname;

    public Doctor(String fullname){
        this.fullname = fullname;
    }

    @Override
    public String toString(){
        return "Doctor{" + "fullname'" + fullname + '\'' + '}';
    }
}