//kiem tra xem n cos phai la so hoan hao khong
// so hoan hao la so co tong cac uoc nguyen duong thuc su cua no bang chinh no
// in ra true hoac false
public class forloopb {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(numberPerfect(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    public static boolean numberPerfect(int n) {
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += (i + n/i);
            }
        }
        if(sum == n) {
            return true;
        }
        return false;
    }
}