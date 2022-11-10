

public class Amountt extends Cat {
   

public static  int Amount;

    public static int  amt() {

        
        if (Category == "Classic") {
            if (size.Size == "Regular")
            Amount = 135;
            else if (size.Size == "Medium")
            Amount = 210;
            else
            Amount = 260;

        }
     
        if (Category == "Premium") {
            if (size.Size == "Regular")
            Amount = 165;
            else if (size.Size == "Medium")
            Amount = 240;
            else
            Amount = 395;
        }
        if (Category == "Supreme") {
            if (size.Size == "Regular")
             Amount = 190;
            else if (size.Size == "Medium")
            Amount = 290;
            else
            Amount = 425;
        }
    
        return Amount;
   

    }
}