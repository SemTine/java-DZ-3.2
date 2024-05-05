//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 98;
        double height = 1.87;
        double imt = service.canculate(bodyMass, height);

        System.out.println("Вашь вес " + bodyMass + "kg");
        System.out.println("И рост " + height + "m");
        System.out.println("Эквивалетно " + imt + ".");

    }

}