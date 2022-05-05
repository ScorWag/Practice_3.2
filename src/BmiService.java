public class BmiService {
    public float calculate(float weight, float height) {
        float bmiCount = weight / (height * height);
        return bmiCount;
    }
}
