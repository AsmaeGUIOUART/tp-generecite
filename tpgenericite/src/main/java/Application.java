import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c;
        MetierProduitImp metier = new MetierProduitImp();
        while (true) {
            System.out.println("entrer une lettre");
            c = scanner.nextLine();
            long Id;
            switch (c) {
                case "a":
                    System.out.println(metier.getAll());
                    break;
                case "b":
                    Id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println(metier.findById(Id));
                    break;

                case "c":
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nom = scanner.nextLine();
                    String marque = scanner.nextLine();
                    double prix = scanner.nextDouble();
                    scanner.nextLine();
                    String description = scanner.nextLine();
                    double nbrstock = scanner.nextInt();
                    scanner.nextLine();
                    Produit produit = new Produit(id,nom,marque,prix,description,nbrstock);
                    metier.add(produit);
                    break;
                case "d":
                    Id = scanner.nextLong();
                    scanner.nextLine();
                    metier.delete(Id);
                    break;
                case "e":
                    System.out.println("Fin le programme");
                    return;
                default:
                    System.out.println("choix invalide");
                    break;

            }


        }
    }
}
