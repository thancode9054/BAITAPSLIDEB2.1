public class vidu2 {
    public static void ganGiaTri3() {

        int a[] = { 7, 9, 8, 10, 20 };
        try {
            System.out.println("Gan gia tri 111 cho vi tri 5 cua mang ");
            a[5] = 111;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi truy can vi tri ngoai mang");
        } finally {
            System.out.println("Lenh nay luon thuc hien");
        }
        System.out.println("Chuyen sang cac lenh ke tiep");
    }

    public static void main(String[] args) {
        ganGiaTri3();
    }

}