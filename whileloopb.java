//nhap l, r (l < r) tu doi dong lenh
//Dem so luong so nguyen trong doan [l,r] va in ra man hinh
public class whileloopb {
    public static void main(String[] args) {
        int l = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        if( l >= r ) {
            System.out.println("Nhap du lieu khong hop le");
        } else {
            System.out.println("So luong so nguyen duong trong doan [" + l + "," + r + "] la: " + sumNumber(l,r));
        }
    }

    public static int sumNumber(int l, int r) {
        int sumNumber = 0;
        int i = l;
        while(i <= r) {
            sumNumber += 1;
            i++;
        }
        return sumNumber;
    }
}