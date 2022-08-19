package Lab;

public class Clock {
    public static void main(String[] args) {

        // Часовете започват от 0 до 23

        for (int i = 0; i <= 23; i++) {
            //Минутите започват от 0 до 59
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%d:%d%n", i, j);




//                if (i < 10 && j < 10)
//                    System.out.printf("%d:%d%n", i, j);
//                else if (i < 10)
//                    System.out.printf("%d:%d%n", i, j);
//                else if (j < 10)
//                    System.out.printf("%d:%d%n", i, j);
//                else {
//                    System.out.printf("%02d:%02d%n", i, j);
//                }
            }
        }
    }
}
