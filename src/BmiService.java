public class BmiService {
    public double canculate(double bodyMass, double height) {

        double boydMassIndex;
        boydMassIndex = bodyMass / (height * height);
        return boydMassIndex;

    }
}
