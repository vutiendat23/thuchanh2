// nhap vao so nguyen n tu doi dong lenh va in ra so dao nguoc cua nguoc
public class whileloopa {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("so dao nguoc cua " + n + "la: " + numberOppsite(n));

    }
    public static int numberOppsite (int n)  {
        int oppsite = 0;
        int a;
        while(n > 0) {
            a = n%10;
            oppsite = oppsite*10 + a;
            n = n/10;
        }
        return oppsite;
    }
}