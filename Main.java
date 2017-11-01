public class Main {

    public static void main(String[] args) {
        // Your amazing code goes here...
        System.out.println("We are making a new PEZ Dispender");
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("Fun Fact: there are %d PEX allowed in every dispanser %n", dispenser.MAX_PEZ);
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is Empty");
        }
        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is Full");
        }
        System.out.println("Filling the dipenser with delicious PEZ...");
        dispenser.fill();
        while (dispenser.dispense()) {
            System.out.println("CHOMP!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("CHOMP!");
        }
        try {
            dispenser.fill(32);
            System.out.println("I will never be called due to the exception");
        } catch (IllegalArgumentException iae) {
            System.out.println("Too Many");
            System.out.printf("The Error was %s %n", iae.getMessage());

        }

    }
}