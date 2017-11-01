public class Main {

    public static void main(String[] args) {
        // Your amazing code goes here...
        System.out.println("We are making a new PEZ Dispender");
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("Fun Fact: there are %d PEX allowed in every dispanser %n", dispenser.MAX_PEZ);
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        System.out.println("Filling the dipenser with delicious PEZ...");
        dispenser.fill();
    }
}