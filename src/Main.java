public class Main {

    static double min;

    public static void main(String[] args) {
        min = 1234123412;
        double step = 10;
        double xIn = -1000000000;
        int layer = 0;
        min(step, xIn, layer);
        System.out.println(min);
    }

    public static void min(double step, double xIn, int layer){
        System.out.println("h");
        try {
            for (double x = xIn; x < -1*xIn; x = x + step) {
                if(layer == 1) System.out.println(layer);
                double value = Math.pow(x + 2, 2) + 4;
                if (min == 1234123412) {
                    min = value;
                } else if (value < min) {
                    min = value;
                } else if (value > min) {
                    min((step / 10) * -1, x, layer + 1);
                }
            }
        } catch(StackOverflowError e){
            System.out.println("final");
            System.out.println(min);
        }
    }
}
