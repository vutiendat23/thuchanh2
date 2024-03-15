// in ra man hinh so fibonaci thu n
public class forloopd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n > 0) {
            System.out.println(numberFibonacci(n));
        } else {
            System.out.println("Nhap du lieu khong hop le");
        }
    }
    public static int numberFibonacci (int n) {
        if(n <=1 ) {
            return n;
        }
        int number1 = 0;
        int number2 = 1;
        int numbern = 0;
        
        for(int i = 2; i <= n; i++) {
            numbern = number1 + number2;
            number1 = number2;
            number2 = numbern;
        }
        return numbern;
    }

}