public class Main {
    public static void main(String[] args) throws InterruptedException {



        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

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