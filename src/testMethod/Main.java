package testMethod;

public class Main {

    public static void main(String[] args) {
        int i;
        i = x(8);
    }

    static int x(int n) {
        if (n <= 3){
            System.out.println("if---");
            return 1;
        }
        else{
            System.out.println("else---");
            return x(n - 2) + x(n - 4) + 1;
        }
    }
}
