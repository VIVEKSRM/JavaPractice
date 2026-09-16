package JavaPractice2;

public class armstrongNumber {

        public static void main(String[] args) {

            int num = 153;
            int original = num;
            int temp = num;

            // Count number of digits
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            // Calculate Armstrong sum
            int sum = 0;
            temp = num;

            while (temp > 0) {

                int digit = temp % 10;

                int power = 1;

                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }

                sum += power;

                temp /= 10;
            }

            if (sum == original) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }

}
