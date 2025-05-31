import java.util.ArrayList;
import java.util.Collections;

class PlayingCard
{
    String cardSuit; String cardRank;
    public PlayingCard(String cardSuit, String cardRank)
    {
        this.cardSuit = cardSuit; this.cardRank = cardRank;
    }
    @Override
    public String toString()
    {
        return cardRank + " of " + cardSuit;
    }
}

class CardCollection
{
    ArrayList<PlayingCard> cardList;
    public CardCollection()
    {
        this.cardList = new ArrayList<>();
        String[] suits = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};
        String[] ranks = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                cardList.add(new PlayingCard(suit, rank));
            }
        }
    }
    public void mixCards()
    {
        Collections.shuffle(cardList);
    }
    public void showCards()
    {
        for (PlayingCard card : cardList)
        {
            System.out.println(card);
        }
    }
}

public class CardGame
{
    public static void main(String[] args)
    {
        CardCollection cardCollection = new CardCollection();
        cardCollection.mixCards();
        cardCollection.showCards();
    }
}