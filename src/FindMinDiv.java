public class FindMinDiv {
    public static void main(String[] args) {
        double first = Double.parseDouble(args[0]) / Double.parseDouble(args[1]);
        double second = Double.parseDouble(args[1]) / Double.parseDouble(args[0]);

        if (first < second) {
            System.out.println(first);
        } else
            System.out.println(second);
    }
}
