public class SummFromNumber {
    public static void main(String[] args) {
        int tempSum = 0;
        int tempNum = 0;
        int Num = Integer.parseInt(args[0]);
        while (Num > 0) {
            tempNum = Num % 10;
            tempSum = tempSum + tempNum;
            Num = Num / 10;
            System.out.println(tempSum);
        }


    }
}
