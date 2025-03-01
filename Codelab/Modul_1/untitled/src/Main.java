import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String Firstname;
        char Gender;
        int Birthyear;

        Scanner objInput = new Scanner(System.in);

        System.out.print("Tulis nama : ");
        Firstname = objInput.nextLine();
        System.out.print("Tulis jenis kelamin : (P/L) ");
        Gender = objInput.nextLine().charAt(0);
        System.out.print("Tulis tahun kelahiran : ");
        Birthyear = objInput.nextInt();

        int currentYear = LocalDateTime.now().getYear();
        int Age = currentYear - Birthyear;

        System.out.println();
        System.out.println("Data Dirimu ");
        System.out.println("Masukkan Nama : "+ Firstname);
        if (Gender == 'L' || Gender == '1') {
            System.out.println("Jenis Kelamin : Laki-laki");
        } else if (Gender == 'P' || Gender == 'p') {
            System.out.println("Jenis Kelamin : Perempuan");
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Usia    : "+Age);
    }
}