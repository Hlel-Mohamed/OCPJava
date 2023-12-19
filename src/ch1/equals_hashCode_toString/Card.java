package ch1.equals_hashCode_toString;

public class Card {
    private String rank;
    private String suit;
    public Card(String rank, String suit) {
        if (rank == null || suit == null) throw new IllegalArgumentException("rank or suit is null.");
        this.rank = rank;
        this.suit = suit;
    }
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Card)) return false;
        Card otherCard = (Card) obj;
        return rank.equals(otherCard.rank) && suit.equals(otherCard.suit);
    }
    public int hashCode() {
        return rank.hashCode();
    }
}
