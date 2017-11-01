class PezDispenser {
    final private String characterName;
    public final static int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    // Create a public mthod named getCharacterName where we return the private string characterName;
    public String getCharacterName() {
        return characterName;
    }

}