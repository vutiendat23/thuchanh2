//  nhập x từ đối dòng lệnh 
// tính ln(x+1) bằng khai triển maclaurin đến 10 mũ - 6
public class whileloopg {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double ketqua = 0;
        double a = x;
        double i = 1;
        while (Math.abs(a) >= 1e-6) {
            ketqua += a;
            a *= -x / (i + 1);
            i++;
        }
        System.out.println("Giá trị ln(1 + x) là: " + ketqua);
    }
}