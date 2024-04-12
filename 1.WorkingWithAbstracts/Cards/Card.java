package L_01_WorkingWithAbstracts.cards;

public class Card {

    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }
    public int cardPower (){
        return cardSuit.getOriginalValue() + cardRank.getOriginalValue();
    }
}
