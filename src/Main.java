public class Main {
    public static void main(String[] args) {
        double plus = 0.0;
        int count = 0;

        double array[] = {2.3, 1.4, 1.6, -4.0, 5.8, 3.5, -1.0, 3.1, -1.2,-0.3, 2.5, 1.5, 1.2, -4.3, 5.4 };
        for (int i=0;i< array.length ; i++) {
            if (array[ i] < 0) {
                for (int j=i+1; j < array.length; j++) {
                    if (array[ j] > 0) {
                        plus += array[ j];
                        count ++;
                    }
                }
                break;


            }

        }
        System.out.println(plus/count);
    }
}