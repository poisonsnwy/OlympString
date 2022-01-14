import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();


        System.out.println(""+s.charAt(3)+s.charAt(7)+s.charAt(11));
        int n = s.length();
        System.out.println(""+s.charAt(1)+s.substring(n-1));

        System.out.println(s.substring(0,6));
        System.out.println(s.substring(3));
        for (int i = 1; i < n; i++) {
           if (i % 2 == 0){
               System.out.print(s.charAt(i));
           }
        }
        System.out.println();
        System.out.println(n/2);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        }
    }

