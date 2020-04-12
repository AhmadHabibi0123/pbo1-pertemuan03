package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs : \"Terima Kasih Pak\"");
                System.out.println("Dosen : \"Selamat Yah !!\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Kenapa Ulun Kada dapat A pak?\"");
                System.out.println("Dosen : \"Kurang Ta nilai ikm makanya dapat B\"");
                break;
            case 'C':
                System.out.println("Mhs : \"Ulun Turun tarus, ngumpul ja lawan tugas kenapa C pak?\"");
                System.out.println("Dosen : \"Umpat Ujian ja kd ikm, kya apa hndk bagus nilai\"");
                break;
            case 'D':
                System.out.println("Mhs : \"Ulun Turun tarus, ngumpul ja lawan tugas kenapa D pak\"");
                System.out.println("Dosen : \"bujur jua kah\"");
                System.out.println("Dosen : \"Hadang Melihati Dulu\"");
                System.out.println("Dosen : \"Mana Mana Kah suah ngumpul tugas\"");
                System.out.println("Mhs : \"Iya Am di cek, KABUR..\"");
                break;
        }
    }
}
