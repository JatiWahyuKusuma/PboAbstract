public class MainClass {
    public static void main(String[] args) {
        Lampu lmp = new Lampu();
        Setlika stk = new Setlika();

        System.out.println("===================================");
        System.out.println("|      DATA ALAT ELEKTRONIKA      |");
        System.out.println("===================================");
        stk.tampilMerk();
        stk.tampilDaya();
        stk.tampilWarna();
        System.out.println("===================================");
        lmp.tampilMerk();
        lmp.tampilDaya();
        lmp.tampilJenis();
        System.out.println("===================================");
    }
}
