public class Multiples {
    public static void main(String[] args) {

        int j = 0;

        for(int i = 1; i < 100; i++){
            boolean divisibleBy3 = i%3 == 0;
            boolean divisibleBy5 = i%5 == 0;

            if (divisibleBy3 && divisibleBy5) {

                System.out.println(i);
                j++;

            } else if (divisibleBy3) {

                System.out.println(i);
                j++;

            } else if (divisibleBy5) {

                System.out.println(i);
                j++;

            } else {

            }
        }
        System.out.print("The total number of multiples of 3 or 5 are: ");
        System.out.println(j);
    }
}
