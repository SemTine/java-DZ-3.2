public class BmiService {
    public int imt(double weight, double height) {

        double index = weight / (height * height);
        return (int) index;
    }

}

