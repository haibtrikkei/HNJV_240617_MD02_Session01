import java.util.Scanner;

public class Nhap_HienThi_DL {
    public static void main(String[] args) {
        String fullName;
        int yearOfBirth;
        String address;
        String className;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên của bạn: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập vao năm sinh: ");
        yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào quê quán: ");
        address = scanner.nextLine();
        System.out.println("Nhâp vào tên lớp học: ");
        className = scanner.nextLine();

        System.out.println("\nThông tin của bạn: ");
        System.out.println("\tHọ tên: "+fullName);
        System.out.println("\tNăm sinh: "+yearOfBirth);
        System.out.println("\tQuê quán: "+address);
        System.out.println("\tLớp học: "+className);
    }
}
