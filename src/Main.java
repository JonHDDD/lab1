public class Main {
    public static void main(String[] args) {
        int k=25;
        int n=10;
        double x = 3.6;
        int y = (int)x+((int)((x-(int)x+0.01)/0.5));
        int resultone = k/n;
        int resulttoo = k%n;
        int summa = resultone + resulttoo;
        System.out.println("Дiлення "+resultone);
        System.out.println("Остача вiд дiлення "+resulttoo);
        System.out.println("Округлення " + y);
    }
}