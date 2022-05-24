public class Main {

    public static void main(String [] args) {
        BmiService service = new BmiService ();
        double myWeight = 80;
        double myHeight = 1.81;
               double bodyMassIndex = service.calculate(myWeight, myHeight);
        System.out.println("Ваш индекс массы тела:");
        System.out.println(bodyMassIndex);
    }
}
