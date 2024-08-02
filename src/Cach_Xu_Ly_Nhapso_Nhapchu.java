import java.util.Scanner;

public class Cach_Xu_Ly_Nhapso_Nhapchu {
    public static void main(String[] args) {
        int number;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = Integer.parseInt(sc.nextLine());    // Luc nhap chuong trinh hieu: "254234" (chuoi so)   -> parseInt se thanh: 25434 (so)
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("So: "+number);
        System.out.println("Name: "+name);
    }
}
