
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Injiza izina ry'iduka:");
    String izina = input.nextLine();

    System.out.println("Injiza TIN number y'umucuruzi:");
    String tin = input.nextLine();

    System.out.println("Izina ry'iduka: " + izina);
    System.out.println("TIN number: " + tin);

    System.out.println("MENU IS STARTING...");

    int choice = 0;

    while (choice != 9) {

        System.out.println("1. Add products");
        System.out.println("2. Remove products");
        System.out.println("3. View products");
        System.out.println("9. Exit");

        System.out.print("Choose: ");
        choice = input.nextInt();
    }

    input.close();
}
