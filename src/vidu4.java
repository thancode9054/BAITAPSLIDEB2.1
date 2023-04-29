
import java.util.Scanner;

public class vidu4 {

    private static Scanner input;

    public static double giaTriPhanSo(int tu, int mau) throws ArithmeticException {
        if (mau == 0)
            throw new ArithmeticException();
        else
            return (double) tu / mau;
    }

    public static int nhap() {
        input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so ! hay nhap lai ");
                input.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        double giaTri;
        System.out.print("Nhap tu so: ");
        int tu = nhap();
        System.out.print("Nhap mau so: ");
        int mau = nhap();
        try {
            giaTri = giaTriPhanSo(tu, mau);
            System.out.println("Gia tri phan so la: " + giaTri);
        } catch (ArithmeticException e) {
            System.out.println("Loi nhap mau so bang khong");
        }
    }

}
