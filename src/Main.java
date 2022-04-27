public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Serhii Kovalenko";
        client1.age = 34;
        client1.cash = 35_000.00;
        client1.isWantCredit = true;
        client1.isBuyCredit = false;

        Client client2 = new Client();
        client2.name = "Artem Kovalenko";
        client2.age = 3;
        client2.cash = 45_000.00;
        client2.isWantCredit = true;
        client2.isBuyCredit = true;

        Client client3 = new Client();
        client3.name = "Tetiana Kovalenko";
        client3.age = 31;
        client3.cash = 30_000.00;
        client3.isWantCredit = true;
        client3.isBuyCredit = true;

        Client client4 = new Client();
        client4.name = "Maksim Kasap";
        client4.age = 34;
        client4.cash = 60_000.00;
        client4.isWantCredit = true;
        client4.isBuyCredit = true;

        Car car1 = new Car();
        car1.model = "Mazda 3";
        car1.price = 40_000.00;
        car1.quantity = 4;

        Car car2 = new Car();
        car2.model = "Mazda 2";
        car2.price = 20_000.00;
        car2.quantity = 0;

        System.out.println("Client 1: " +client1.name);
        System.out.println("Car: " + car1.model);
        client1.carSell(car1.price, car1.quantity);

        System.out.println("\nClient 2: " +client2.name);
        System.out.println("Car: " + car1.model);
        client2.carSell(car1.price, car1.quantity);

        System.out.println("\nClient 3: " +client3.name);
        System.out.println("Car: " + car1.model);
        client3.carSell(car1.price, car1.quantity);

        System.out.println("\nClient 4: " +client4.name);
        System.out.println("Car: " + car1.model);
        client4.carSell(car1.price, car1.quantity);

        System.out.println("\nClient 5: " +client3.name);
        System.out.println("Car: " + car2.model);
        client3.carSell(car2.price, car2.quantity);
    }

}