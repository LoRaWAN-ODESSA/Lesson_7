public class DoSell {

    public static boolean isAdult(int clientAge) {
        if(clientAge >= 18) {
            return true;
        } else {
            int growUp = 18 - clientAge;
            System.out.println("Sorry, come back in " + growUp + " years");
            return false;
        }
    }

    public static boolean isAvailable(int carQuantity) {
        if(carQuantity > 0) {
            return true;
        } else {
            System.out.println("Sorry, this car is not available!");
            return false;
        }
    }

    public void carSell(String name, int age, double cash, boolean isWantCredit, boolean isBuyCredit, double price, int carAvailable) {
        boolean existCar = isAvailable(carAvailable);
        boolean adult = isAdult(age);
        if(existCar == true && adult == true) {
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
