import java.util.ArrayList;
import java.util.Scanner;

// sc.nextLine(); is used to prevent some complication, we should use them after we had used "int (varName) = int.nextInt();"
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> products = new ArrayList<>(); // Create new object
        Scanner sc = new Scanner(System.in); // Create new object
        boolean flag = true;
        
       
        
        
       
        while(flag) {
        
        System.out.println("Add product -> 0"); // Just instructions
        System.out.println("Remove product -> 1");
        System.out.println("Update product -> 2");
        System.out.println("List products -> 3");
        System.out.println("To exit -> 4");
        System.out.print("Your answer: ");
        int istek = sc.nextInt();
        
        System.out.println("****************************");
        switch(istek) { // istek is request
        
            
            case 0:
                System.out.print("Product name: ");
                sc.nextLine();
                String productName = sc.nextLine();
                products.add(productName);
                System.out.println("The product has been added.");
                System.out.println("****************************");
                break;
            
            case 1:
                System.out.print("Product name or order: ");
                sc.nextLine();
                String productInfo = sc.nextLine();
                
                if (productInfo.toUpperCase().equals(productInfo) && productInfo.toLowerCase().equals(productInfo)) { 
                    // It controls whether you write an order, which only includes numbers and don't have upper or lower cases, or sth which
                    // also includes chars and also has upper and lower cases.
                    // If it detects that input doesn't have different cases, it assumes that it is an order- if you don't use speacial
                    // special characters like '@' :)
                    
                    int intUrun = Integer.parseInt(productInfo);
                    intUrun--; // transform to index in array
                    products.remove(intUrun);
                } else {
                
                products.remove(productInfo);
                System.out.println("The product has been removed.");
                System.out.println("****************************");
                }
                break;
                
            case 2:
                System.out.print("Product order: ");
                int urunBilgisi1 = sc.nextInt();

                System.out.print("New value: ");
                sc.nextLine(); // If you wanna learn why just read the sentence which is in 4, but it is not detailed
                String yeni = sc.nextLine();
                
                products.set(urunBilgisi1 - 1, yeni);
                System.out.println("The product has been updated.");
                System.out.println("****************************");
                break;
                
            case 3:
                if(products.isEmpty()) // if empty
                {System.out.println("List is empty.");
                } else{System.out.println("Products: ");
                
                for(String i: products) { // iteration which is easy
                    
                    System.out.println((products.indexOf(i)+1) + " | " + (i));
                }
                }
                System.out.println("****************************");
                break;
                
            case 4:
                System.out.println("Program finished!");
                flag = false;
                continue;
                     
             
                     
            default:
                 System.out.println("You've done invalid sth :/");
                 System.out.println("****************************");
                
        }
    }
    
}
}