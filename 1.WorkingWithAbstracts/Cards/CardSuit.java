package L_01_WorkingWithAbstracts.cards;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int originalValue;

    CardSuit(int originalValue) {
        this.originalValue = originalValue;
    }

    public int getOriginalValue() {
        return originalValue;
    }

    }
