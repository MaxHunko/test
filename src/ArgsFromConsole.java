public class ArgsFromConsole {
    public static void main(String[] args) {
        String tempArgs = "";
        for (int i = 0; i < args.length; i++) {
            tempArgs = tempArgs + args[i] + " ";
        }
        System.out.println(tempArgs);
    }
}
