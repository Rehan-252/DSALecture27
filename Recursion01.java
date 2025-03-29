import java.util.Scanner;
class Recursion01{

    static void printincreas(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printincreas(n-1);
        System.out.print(n + " ");
    }

    static void printdescreas(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printdescreas(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        System.out.println();
        printincreas(n);
        System.out.println();
        printdescreas(n);
        in.close();
    }
}