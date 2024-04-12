package L_01_WorkingWithAbstracts.cards;

public enum CardRank {
    ACE(14, "ACE"),
    TWO(2,"TWO"),
    THREE(3, "THREE"),
    FOUR(4, "FOUR"),
    FIVE(5, "FIVE"),
    SIX(6, "SIX"),
    SEVEN(7, "SEVEN"),
    EIGHT(8, "EIGHT"),
    NINE(9, "NINE"),
    TEN(10, "TEN"),
    JACK(11, "JACK"),
    QUEEN(12, "QUEEN"),
    KING(13, "KING");

    private int originalValue;
    private String namesValue;

    CardRank(int originalValue, String namesValue) {
        this.originalValue = originalValue;
        this.namesValue = namesValue;
    }

    public int getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(int originalValue) {
        this.originalValue = originalValue;
    }

    public String getNamesValue() {
        return namesValue;
    }

    public void setNamesValue(String namesValue) {
        this.namesValue = namesValue;
    }
}
