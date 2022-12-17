import java.util.Arrays;

public record ArrayFromRegularNumbers() {
    public static void main(String[] args) {
        int arrayLength = Integer.parseInt(args[0]);
        int[] array = new int[arrayLength];
        int counter = 0;

        for (int i = 2; i < arrayLength; i++) {
            for (int a = 2; a < (arrayLength*arrayLength); a++) {
                boolean isPrime = true;
                for (int k = 2; k <= Math.floor(Math.sqrt(a)); k++) {
                    if ((a % k) == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime && counter <= arrayLength-1) {
                    array[counter] = a;
                    counter++;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
