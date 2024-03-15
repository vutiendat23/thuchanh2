//Cấu trúc lặp
public class forloopa {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(numberPrime(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean numberPrime(int n) {
        if(n<2) {
            return false;
        }
        int count = 0;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }
}