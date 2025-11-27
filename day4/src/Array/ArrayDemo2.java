package Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        shuffleDeck();
    }
    //定义一个方法，存储着54张扑克牌，完成洗牌操作
    public static void shuffleDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[54];
        int index = 0;

        // 创建52张牌
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // 添加两张王牌
        deck[index++] = "Joker (Black)";
        deck[index++] = "Joker (Red)";

        // 洗牌操作
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            // 交换牌
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // 输出洗好的牌
        for (String card : deck) {
            System.out.println(card);
        }
    }
}
