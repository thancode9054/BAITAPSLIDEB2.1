public class vidu1 {
    public static void ganGiaTri2() {
        int a[] = { 7, 9, 8, 10, 20 };
        try {
            System.out.println("Gan gia tri 111 cho vi tri 5 cua mang ");
            a[5] = 111;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi truy can vi tri ngoai mang");
        }
        System.out.println("Chuyen sang cac lenh ke tiep");
    }

    public static void main(String[] args) {
        ganGiaTri2();
    }

}
