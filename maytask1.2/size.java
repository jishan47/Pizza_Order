import java.util.Scanner;

 public class size{

    public static String Size;


    void si() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Size of the Pizza:");
        System.out.println("1. Regular");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        System.out.print("Enter Size: ");
        int si = sc.nextInt();

        switch (si) {
            case 1:
                Size = "Regular";
                break;
            case 2:
                Size = "Medium";
                break;
            case 3:
                Size = "Large";
                break;
            default:
                System.out.println("Invalid Size: ");
                return;
        }
        System.out.println("Selected Size is: " + Size + "\n");
    }
}
     