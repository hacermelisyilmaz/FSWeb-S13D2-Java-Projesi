public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrom Sayıyı Bulma:");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println("**********");
        System.out.println("Mükemmel Sayıları Bulma:");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("**********");
        System.out.println("Mükemmel Sayıları Bulma:");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
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

    public static boolean isPerfectNumber(int number) {
        if (number < 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return number == sum;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        String[] digitStrings = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        char[] numberAsChars = String.valueOf(number).toCharArray();
        String word = "";

        for (char digitChar: numberAsChars) {
            word += digitStrings[Integer.parseInt(String.valueOf(digitChar))] + " ";
        }
        return word.trim();
    }
}