public class Challenge1 {

    public static void FizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if(i%3 == 0) {
                    System.out.print("Fizz, ");
            } else if (i%5 == 0) {
                    System.out.print("Buzz, ");
            } else if(i%7 == 0) {
                System.out.println("Rizz, ");
            } else if(i%11 == 0) {
                System.out.println("Jazz, ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz();
    }
}
