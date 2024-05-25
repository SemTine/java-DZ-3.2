//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight = 98;
        double height = 1.87;
        int imt = service.imt(weight, height);

        System.out.println("Вашь вес " + weight + "kg ");
        System.out.println("И рост " + height + "m ");
        System.out.println("Эквивалетно " + imt);

    }

}

