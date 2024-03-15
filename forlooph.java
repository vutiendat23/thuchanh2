// nhap them so thuc x
// khai trien taylor cox(x) den x mux 2n in ket qua ra man hinh 
public class forlooph {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double x = Double.parseDouble(args[1]);
        System.out.println("ketqua = " + ketqua(x, n));
    }
    public static double ketqua(double x, int n) {
        double sum = 1;
        double a = 1;
        double here = -1;
        for(int i = 1; i <= n; i++) {
            a *= Math.pow(x,2)/((2*i)*(2*i-1));
            sum += a*here;
            here *= (-1);
        }
        return sum;
    }
}