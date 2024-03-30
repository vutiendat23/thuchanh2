//nhap n tu doi dong lenh, kiem tra n co phai so dep hay khong, in ra true , false
// so dep la so chia het cho tong cac chu so cua no 
// vd 243 xem co chia het cho (2+4+3) khong
public class whileloopd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(numberBeautiful(n)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
    public static boolean numberBeautiful(int n) {
        int sum = 0;
        int a;
        int b = n;
        while(b > 0) {
            a = b % 10;
            sum += a;
            b = b / 10;
        }
        return n % sum == 0;
    }
}
