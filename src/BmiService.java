public class BmiService {
    public double canculate(double weight, double height) {

        double boydMassIndex;
        boydMassIndex = weight / (height * height);
        return boydMassIndex;
    }

}

