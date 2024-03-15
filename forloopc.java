// in ra man hinh n so nguyen to dau tien
public class forloopc {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n >= 0) {
            for(int i = 0; i <= n; i++) {
                if(numberPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Nhap du lieu khong chinh xac");
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