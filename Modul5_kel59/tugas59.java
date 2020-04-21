import java.util.Scanner;
public class tugas59 {
        public static void main(String[] args) {
        //Deklarasi Variabel
        String email, password;
        // Membuat objek baru dengan menggunakan fungsi scanner
        Scanner input = new Scanner(System.in);
        // Membaca Input user dan disimpan di variabel email
        System.out.print("Email : ");
        email = input.nextLine();
        // Membaca Input user dan disimpan di variabel password
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService kel59 = new userService(email, password);
        kel59.login();
        }
}