public class userService 
// mendekalarasikan variabel
{
    private String[][] data = new String[2][3];
    private String[][] histories = new String [2][4];
    private String email, password, roles = "";
    private String pinjam1 = "", pinjam2 = "", tanggal = "";
        // constructor userService yang akan dijalankan
        public userService(String emails, String passwords)
        {   
            // Mendeklarasikan variabel untuk email dan password
            email = emails;
            password = passwords;
            // Membuat data array 2 dimensi untuk data pengguna
            String[][] data = {
                {"putrirohmawatikelompok59@gmail.com", "12345", "superadmin" },
                {"fadzilferdiawankelompok59@gmail.com", "12345", "user"  }
            };
            // Membuat data array 2 dimensi untuk data peminjaman buku dan tanggal peminjaman
            String[][] histories = {
                {"putrirohmawatikelompok59@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman","21-04-2020"},
                {"fadzilferdiawankelompok59@gmail.com", "Elektronika Dasar", "Kalkulus", "21-04-2020"}
            };
            // Membuat fungsi this untuk mengisi variabel data dan histories
            this.data = data;
            this.histories = histories;
        }
        // Fungsi Checkcredentials yang mengembalikan nilai boolean
        private boolean checkCredentials()
        {
            for (int i = 0; i < data.length; i++)
            // Pengkondisian jika memasukkan email dan password dengan benar
            {   
                if (data[i][0].equals(email))
                {if (data[i][1].equals(password))
                    {
                    pinjam1 = histories[i][1];
                    pinjam2 = histories[i][2];
                    tanggal = histories[i][3];
                    roles = data[i][2];
                    return (true);
                    }
                    
                
                }
            }
            return (false);
        }
        // Modifier public yang mengambil fungsi login
        public void login()
        {   // Pengecekan apakah status bernilau true atau false melalui fungsi checkcredentials
            boolean status = checkCredentials();
            if (status == true)
            // Penampilan output jika status bernilau true
            {
                System.out.println("\nWelcome " + roles);
                System.out.println("Logged it as user email: " + email);
                System.out.println("Buku yang dipinjam :");
                System.out.println("Buku 1 : "+ pinjam1);
                System.out.println("Buku 2 : "+ pinjam2);
                System.out.println("Tanggal Peminjaman: " + tanggal);
            }
            else
            // Penampilan output jika status bernilai false
            {
                System.out.println("\nInvalid Login");
            }
        }
}