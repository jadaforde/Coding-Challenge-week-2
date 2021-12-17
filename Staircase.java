package CodingChallenge;

public class Staircase {
    public int steps (int n){
        return fib(n+1);
    }
    public int fib(int n){
        if (n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        Staircase staircase = new Staircase();

        System.out.println(staircase.steps(1));
        System.out.println(staircase.steps(2));
        System.out.println(staircase.steps(5));
        System.out.println(staircase.steps(0));
    }
}
