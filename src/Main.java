public class Main {
    public static void main(String[] args) throws InterruptedException {


        for (int i=0; i<20;i++){
            System.out.println(" hello the world I'm Coming ");
            Thread.sleep(1000);

        }
        System.out.println("=========================");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Ford";
        System.out.println(cars[0]);


    }
}