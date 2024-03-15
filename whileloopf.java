//nhap n tu doi dong lenh
// in ra n so sieu le dau tien
// so sieu le la so le, tong cac chu so cua no la so le,cac chu so cua no la so le
public class whileloopf {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printNumberSole(n);
    }

    public static boolean sole(int n) {
        return n % 2 != 0;
    }

    public static boolean sumnumberle(int n) {
        int sum = 0;
        int a;
        
        while(n>0) {
            a = n % 10;
            sum += a;
            n = n/10;
        } 
        return sum % 2 != 0;
    }

    public static boolean everyNumberSole(int n) {
        int sum = 0;
        int a;
        
        while(n > 0) {
            a = n % 10;
            if(a % 2 == 0) {
                return false;
            }
            n = n / 10;
        } 
        return true;
    }

    public static void printNumberSole(int n) {
        int count = 0;
        int i = 1;
        while(n > 0) {
            
            if(sole(i) == true && sumnumberle(i) == true && everyNumberSole(i) == true) {
                count++;
                System.out.print(i + " ");
            }
            i++;
            if(count == n) {
                break;
            }
        }
    }
}