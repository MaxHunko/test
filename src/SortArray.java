import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int length = args.length;
        int[] massive = new int[length];

        for (int a = 0; a < length; a++) {
            int number = Integer.parseInt(args[a]);
            massive[a] = number;
        }

        boolean isSorted = false;
        int buf;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < length - 1; i++) {
                    if (massive[i] > massive[i + 1]) {
                        isSorted = false;

                        buf = massive[i];
                        massive[i] = massive[i + 1];
                        massive[i + 1] = buf;
                    }
                }
            }

            System.out.println(Arrays.toString(massive));
    }
}