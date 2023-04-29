import java.util.Scanner;

public class vidu5 {
    private static Scanner input;
    static int diem;

    public static class DinhNghiaException extends Exception {
        private static final long serialVersionUID = 1L;

        public DinhNghiaException() {
            super("Diem phai tu 0 den 10!!!");
        }

        public DinhNghiaException(String message) {
            super(message);
        }
    }

    public static void nhap() throws DinhNghiaException {
        input = new Scanner(System.in);
        System.out.print("Nhap vao diem tu o den 10: ");
        diem = input.nextInt();
        if (diem < 0 || diem > 10)
            throw new DinhNghiaException();
    }

    public static void main(String[] args) {
        try {
            nhap();
        } catch (DinhNghiaException e) {
            System.out.println("Loi: " + e);
        }
        System.out.println("Diem vua nhap: " + diem);
    }

}
