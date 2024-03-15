// nhập x từ đói dòng lệnh 
// tính e mũ x đến x mũ n và in kết quả ra màn hình 
public class forloopg {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double x = Double.parseDouble(args[1]);
        System.out.println("ketqua =" + ketqua(x, n));
    }
    public static double ketqua(double x, int n) {
        double sum = 1;
        double a = 1;
        for(int i = 1; i <= n; i++) {
            a *= x/i;
            sum += a;
        }
        return sum;
    }
}