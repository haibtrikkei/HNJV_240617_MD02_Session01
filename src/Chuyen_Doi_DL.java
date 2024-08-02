public class Chuyen_Doi_DL {
    public static void main(String[] args) {
        int a = 5;
        float b = a;

        System.out.println("Gia tri a: "+a);
        System.out.println("Gia tri b: "+b);


        float c = 2.5F;  // mac dinh hieu la double, muon co float phai cho chu f hoac F ở đằng sau
        int d = (int)c;
        System.out.println("Gia tri c: "+c);
        System.out.println("Gia tri cua d: "+d);

        System.out.println("\nThuong cua a va d la: "+(float)a/d);  // ket qua cua 5/2
    }
}
