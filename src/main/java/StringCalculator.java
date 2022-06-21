public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int integer = Integer.parseInt(number.trim());
                if (integer < 0) {
                    throw new IllegalArgumentException("Negatives not allowed");
                } else if (integer >= 1000) {
                    continue;
                }
                returnValue += integer;
            }
        }
        return returnValue;
    }
}

