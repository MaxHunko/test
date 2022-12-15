public class FindMinDiv {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
        int second = Integer.parseInt(args[1]) / Integer.parseInt(args[0]);

        System.out.println(first > second ? first : second);
    }
}
