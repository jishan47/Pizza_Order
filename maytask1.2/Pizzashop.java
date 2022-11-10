import java.util.Scanner;

  class PizzaShop {
    public  static String Cuisine;

    


    public void Shop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO PIZZA SHOP" + "\n");

        // Cuisine
        System.out.println("Select Cuisine:");
        System.out.println("1. Regular");
        System.out.println("2. Jain");
        System.out.println("3. Non-Veg");

        System.out.print("Enter Cuisine: ");
        int cu = sc.nextInt();

        switch (cu) {
            case 1:
                Cuisine = "Regular";
                break;
            case 2:
                Cuisine = "Jain";
                break;
            case 3:
                Cuisine = "Non-Veg";
                break;
            default:
                System.out.println("Invalid Cuisine: ");
                return;
        }
        System.out.println("Selected Cuisine is: " + Cuisine + "\n");

    }

}



