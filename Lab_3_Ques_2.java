abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
    void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose taken successfully");
            System.out.println("Please pay 250 rs");
            firstDoseTaken = true;
        } else {
            System.out.println("Not eligible for first dose");
        }
    }
    void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Second dose taken successfully");
        } else {
            System.out.println("Please complete first dose before taking second dose");
        }
    }
    abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine {
    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }
    @Override
    void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Booster dose taken successfully");
        } else {
            System.out.println("Booster dose cannot be taken without completing vaccination");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        VaccinationSuccessful v = new VaccinationSuccessful(18, "Indian");
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}
