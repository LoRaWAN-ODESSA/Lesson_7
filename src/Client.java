public class Client {
    String name;
    int age;
    double cash;
    boolean isWantCredit;
    boolean isBuyCredit;

    public boolean isAdult() {
        if(age >= 18) {
            return true;
        } else {
            int growUp = 18 - age;
            System.out.println("Sorry, come back in " + growUp + " years");
            return false;
        }
    }

    public boolean isAvailable(int carQuantity) {
        if(carQuantity > 0) {
            return true;
        } else {
            System.out.println("Sorry, this car is not available!");
            return false;
        }
    }

    public void carSell(double price, int carAvailable) {
        if(isAvailable(carAvailable) && isAdult()) {
            if(cash >= price) {
                System.out.println("Dr. " + name + ", congratulations! You can pick up your new car!");
            } else {
                double creditPayment = Math.round((price - cash) / 36);
                if(isWantCredit && isBuyCredit) {
                    System.out.println("The monthly loan payment will be: " + creditPayment + "$ per month.");
                    System.out.println("Dr. " + name + ", congratulations! You can pick up your new credit car!");
                } else if(isWantCredit && !isBuyCredit) {
                    System.out.println("The monthly loan payment will be: " + creditPayment + "$ per month.");
                    System.out.println("Sorry, come back later, when you will want to buy credit");
                } else {
                    System.out.println("Sorry, come back");
                }
            }
        }
    }

}
