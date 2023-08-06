package task05;

/**
 *Напишите проверку на то, является ли строка палиндромом.
 *Палиндром — это слово или фраза, которые одинаково читаются слева направо и справа налево.
 */

public class Task05 {

    public static void main(String[] args) {

        String palindrome1 = "Лидер бредил";
        String palindrome2 = "Муза, ранясь шилом опыта, ты помолишься на разум";

        System.out.println(isPalindromeWay1(palindrome1));

        System.out.println(isPalindromeWay2(palindrome1));


    }

    private static boolean isPalindromeWay1(String inputString) {
        String preparedString = prepareString(inputString);
        int halfLength = (preparedString.length() - preparedString.length() % 2) / 2 ;

        for (int i = 0, j = preparedString.length() - 1; i < halfLength; i++, j--) {
            if (preparedString.charAt(i) != preparedString.charAt(j)) return false;
        }
        return true;
    }

    private static boolean isPalindromeWay2(String inputString) {
        String preparedString = prepareString(inputString);
        String reversedString = new StringBuilder(preparedString).reverse().toString();

        return preparedString.equals(reversedString);
    }

    private static String prepareString(String inputString) {
        return inputString.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я]", "");
    }
}
