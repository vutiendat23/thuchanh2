// nhâp x ( abs x < pi/6)
// khai trien taylor sin(x)
public class forloopf {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double x = Double.parseDouble(args[1]);
        if(x <= (-Math.PI/6) || x >= Math.PI/6) {
            System.out.println("Nhap du lieu sai");
        } else {
            System.out.println("ketqua = " + ketqua(x, n));
        }
    }
    public static double ketqua(double x, int n) {
        double sum = x;
        double a = x;
        double here = -1;
        for(int i = 1; i <= n; i++) {
            a *= Math.pow(x,2)/((2*i)*(2*i + 1));
            sum += a*here;
            here *= (-1);
        }
        return sum;
    }
}