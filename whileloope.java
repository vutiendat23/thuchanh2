// nhap vao so n tu doi dong lenh 
// in ra so luong so dep tu 1 den n
public class whileloope {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printQuantityNumberBeautiful(n);
    }

    public static boolean numberBeautiful(int n) {
        int sum = 0;
        int a;
        int b = n;
        while(b > 0) {
            a = b % 10;
            sum += a;
            b = b/10;
        }
        return n % sum == 0;
    }

    public static void printQuantityNumberBeautiful(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(numberBeautiful(i)) {
                count++;
            }
        }
        System.out.println("So luong so dep tu 1 den " + n + " la :" + count);
    }
}