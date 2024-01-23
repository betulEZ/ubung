public class tag2 {
    public static void main(String[] args) {
        int a = 4 ;
        int b =  5;
        System.out.println("add a+b= "+ add(a,b));

        if( a> b)
            System.out.println("sub a-b =" + sub(a,b));
        else
            System.out.println("add a+b ="+ add(a,b));

        System.out.println("make positive "+ makePositive(-5));
        System.out.println("checksNumber "+ checksNumber(6));
        System.out.println("isPalindrome "+ isPalindrome(363));
    }
    public static int add(int a, int b){
        return a + b ;
    }
    public static int sub(int a, int b){
        return a - b ;

    }
    public static int makePositive(int a) {
        if (a < 1)
            return -a;
        else
            return a;
    }
    public static int checksNumber(int a){
        if (a%2==0)
            return a;
        else
            return a*2;
    }
    public static boolean isPalindrome (int number){
        int temporaryNumber= number;
        int reverse = 0;

        while (temporaryNumber != 0) {
            int remainder = temporaryNumber% 10;
            reverse = reverse * 10 + remainder;
            temporaryNumber = temporaryNumber / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;

    }
    }