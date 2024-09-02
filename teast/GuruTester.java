package teast;

public class GuruTester {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Nama : ");
        // String nama = input.nextLine();
        // System.out.println("Mapel : ");
        // String mapel = input.nextLine();
        // System.out.println("Status : ");
        // String status = input.nextLine();
        // System.out.println("NIP : ");
        // int nip = input.nextInt();
        // input.close();
        
        Guru pakThoriq = new Guru("Thoriq", "Penjas", "Tetap", 2341);
        Guru pakFirman = new Guru("Firman", "BK", "Tetap", 1143);
        Guru buPasha = new Guru("Pasha", "Rpl", "Tetap", 2234);
        Guru pakAbidin = new Guru("Abidin", "Matematika", "Tetap", 4532);
        Guru buAulia = new Guru("Aulia", "Rpl", "Tetap", 4557);

        pakThoriq.print();
        System.out.println("--------------------");
        pakFirman.print();
        System.out.println("--------------------");
        buPasha.print();
        System.out.println("--------------------");
        pakAbidin.print();
        System.out.println("--------------------");
        buAulia.print();
        System.out.println("--------------------");

    }
}
