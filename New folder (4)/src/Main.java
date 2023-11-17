import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap canh a");
        ; // Add a semicolon here
        float a = sc.nextFloat();
        System.out.printf("nhap canh b");
        float b = sc.nextFloat();
        System.out.printf("nhap canh c");
        float c = sc.nextFloat();
        Tamgiac tamgiac = new Tamgiac(a, b, c);
        if (tamgiac.isValid()) {
            System.out.println("chu vi tam giac la" + tamgiac.getChuvi());
            System.out.println("dien tich tam giac la" + tamgiac.getDientich());
        } else {
            System.out.println("3 canh khong phai la tam giac");
        }
    }
}