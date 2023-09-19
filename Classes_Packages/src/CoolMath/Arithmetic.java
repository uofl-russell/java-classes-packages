package CoolMath;

public class Arithmetic {
    private int num1;
    private int num2;

    //create constructor
    Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        printTheValues();
    }

    Arithmetic(int num) {
        this.num1 = num;
        this.num2 = num;
        printTheValues();

    }

    Arithmetic() {
        printTheValues();
    }

    public void updateValues(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        printTheValues();

    }

    private void printTheValues() {
        System.out.println("The values have been set to " + this.num1 + " and " + this.num2);
    }

    public  int addTwoNumbers() {
        return this.num1 + this.num2;
    }

    public static void printTheSumOfTwoNumbers(int a, int b) {
        int output =  sumOfTwoValues(a,b);
        System.out.println("The sum is " + output);
    }

    private static int sumOfTwoValues(int a, int b) {
        return a+b;
    }
}
