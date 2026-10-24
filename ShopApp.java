import java.io.FileWriter;
import java.util.*;
public class ShopApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        try {
            FileWriter write = new FileWriter("Shop.txt",true);

            System.out.println("Injiza izina ry'iduka:");
            String izina = input.nextLine();

            System.out.println("Injiza TIN number y'umucuruzi");
            int tin = input.nextInt();
            
            System.out.println("Murakoze kwinjira muri app");
            System.out.println("Izina ry'iduka:" + izina);
            System.out.println("TIN number y'umucuruzi:" + tin);
            

           write.write("Shop name: " + izina + "\n");
           write.write("TIN number: " + tin + "\n");
           write.close();
            
            
        }catch (Exception e) {
        System.out.println("An error occurred.");
}

        
    }

}