public class MinAndMax {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        double min = 0;
        double max = 0;

        for (double v : array) {
            if (v > max) {
                max = v;
            } else if (v < min) {
                min = v;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
