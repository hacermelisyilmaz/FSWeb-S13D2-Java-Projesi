public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrom Sayıyı Bulma:");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println("**********");
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reversedNumber = 10 * reversedNumber + digit;
        }

        return (originalNumber == reversedNumber);
    }
}