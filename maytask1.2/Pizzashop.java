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



// class Cat extends PizzaShop{

//          public static String Category;
//          public String Pizza;

//          public String[] Ingredients;

//          public void Cate() {

//              Scanner sc = new Scanner(System.in);
//              System.out.println("Select Category:");
//              System.out.println("1. Classic");
//              System.out.println("2. Premium");
//              System.out.println("3. Supreme");

//              System.out.print("Enter Category: ");
//              int ca = sc.nextInt();

//              switch (ca) {
//                  case 1:
//                      Category = "Classic";
//                      break;
//                  case 2:
//                      Category = "Premium";
//                      break;
//                  case 3:
//                      Category = "Supreme";
//                      break;
//                  default:
//                      System.out.println("Invalid Category: ");
//                      return;
//              }
//              System.out.println("Selected Category is: " + Category + "\n");
//          }
     
//          // Pizza
     
//          public void pizza() {

//              PizzaShop ps = new PizzaShop();
//              Amountt am = new Amountt();
//              size ss = new size();

//              Scanner sc = new Scanner(System.in);
//              System.out.println("Select Pizza:");
//              if (Category == "Classic") {
//                  System.out.println("1. Tomchi");
//                  System.out.println("2. Caponito");
//              } else if (Category == "Premium") {
//                  System.out.println("1. Red Indian");
//                  System.out.println("2. Party Lovers");
//              } else if (Category == "Supreme") {
//                  System.out.println("1. American Heat");
//                  System.out.println("2. Re-Union");
//              }
         
//              System.out.print("Enter Pizza: ");
//              int pa = sc.nextInt();
         
//              if (Category == "Classic") {
//                  switch (pa) {
//                      case 1:
//                          Pizza = "Tomchi";
//                          Ingredients = new String[] { "Tomato", "Onion", "Chilly & Cheese" };
//                          break;
//                      case 2:
//                          Pizza = "Caponito";
//                          Ingredients = new String[] { "Capsicum", "Onion", "Tomato & Cheese" };
//                          break;
//                      default:
//                          System.out.println("Invalid Pizza: ");
//                          return;
//                  }
//              } else if (Category == "Premium") {
//                  switch (pa) {
//                      case 1:
//                          Pizza = "Red Indian";
//                          Ingredients = new String[] { "Cheese", "Paneer", "Chilly" };
//                          break;
//                      case 2:
//                          Pizza = "Party Lovers";
//                          Ingredients = new String[] { "Cheese", "Sweet Corn", "Capsicum", "Tomato" };
//                          break;
//                      default:
//                          System.out.println("Invalid Pizza: ");
//                          return;
//                  }
//              } else if (Category == "Supreme") {
//                  switch (pa) {
//                      case 1:
//                          Pizza = "American Heat";
//                          Ingredients = new String[] { "Cheese", "Capsicum", "Baby Corn" };
//                          break;
//                      case 2:
//                          Pizza = "Re-Union";
//                          Ingredients = new String[] { "Cheese", "Spinach", "Capsicum", "Baby Corn", "Olives" };
//                          break;
//                      default:
//                          System.out.println("Invalid Pizza: ");
//                          return;
//                  }
//              }
//              System.out.println("Selected Pizza is: " + Pizza + "\n");
         
//              System.out.println("Please Choice your ingredients: ");
//              System.out.println("Enter 1 for yes, 0 for no." + "\n");
//              for (int i = 0; i < Ingredients.length; i++) {
//                  System.out.print("Do You Want " + Ingredients[i] + "? ");
//                  int n = sc.nextInt();
//                  if (n != 1) {
//                      Ingredients[i] = "";
//                  }
//              }
//              System.out.println("Selected Ingredients: " + getIngredients());
         
//              System.out.println("You hAVE selected " + Cuisine + " " + Pizza + " " + size.Size +  " with " + getIngredients()
//                              + " Worth Price " + Amountt.amt() );
//              System.out.println("Enter 1 to Confirm Order or 2 for Cancle");
//              int nn = sc.nextInt();
//              if (nn == 1)
//                  System.out.println("Order Palced");
//              else
//                  System.out.println("Order Cancled");
//          }
     
//          public String getIngredients() {
//              String ing = "";
//              for (int i = 0; i < Ingredients.length; i++) {
//                  ing = ing + " " + Ingredients[i];
//              }
//              return ing;
           
//          }
         
// }       