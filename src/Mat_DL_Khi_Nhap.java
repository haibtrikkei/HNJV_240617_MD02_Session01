import java.util.Scanner;

public class Mat_DL_Khi_Nhap {
    public static void main(String[] args) {
        int number;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        System.out.println("Enter the name : ");
        name = sc.nextLine();

        System.out.println("Số: "+number);
        System.out.println("Tên: "+name);
    }
}
