
public class SumFromArgs {
    public static void main(String[] args) {
        int tempSum = 0;
        for (int i = 0; i < args.length; i++) {
            int tempArg = Integer.parseInt(args[i]);
            tempSum = tempSum + tempArg;
        }
        System.out.println(Math.round(tempSum));
    }
}
