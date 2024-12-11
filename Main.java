import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static double Addition(double Nomber1, double Nomber2){
        return Nomber1 + Nomber2;
    }


    public static void main(String[] args) {
        double Nomber1 = 0  , Nomber2 = 0;
        int chose ;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("⎯⎯⎯⎯✮ MENU DE CALCULATRICE  ✮⎯⎯⎯⎯⎯");
            System.out.println("1-Addition");
            System.out.println("-⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
            System.out.print("choisir une opération parmi menu  : ");
            chose = input.nextInt();
                System.out.print("Entre 1ere Nbr : ");
                Nomber1 = input.nextDouble();
                System.out.print("Entre 2eme Nbr : ");
                Nomber2 = input.nextDouble();

            switch (chose) {
                case 1:
                    System.out.println("Addition est : " + Addition(Nomber1,Nomber2));
                    break;
                default:
                    System.out.println("Numero invalide !! :)))");
            }
        }
    }
}
