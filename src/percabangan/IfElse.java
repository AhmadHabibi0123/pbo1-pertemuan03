package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, kurangi jajan anda");
        }else if(uangDiDompet>totalBelanja) {
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uang CUkup, angsul :" + angsul);
        }else{
            System.out.println("Uang Cukup, yeay");
        }
    }
}
