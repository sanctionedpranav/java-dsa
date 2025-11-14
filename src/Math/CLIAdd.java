package math;

// public class CLIGreet {
//     public static void main(String args[]) {
//         System.out.println(args[0] + " " + args[1] + " " + args[2]);
//   }
// }
public class CLIAdd {

    public static void main(String args[]) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }

}
