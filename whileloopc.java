// nhap so nguyen n tu ban phim
// dk n>=0 && n <= 100, neu n khong thoa man thi nhap lai
import java.util.Scanner;

public class whileloopc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap so nguyen n: ");
            n = sc.nextInt();
        } while(n < 0 || n > 100);
    }
}