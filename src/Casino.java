public class Casino {
    //declaration section
    public Card aceHearts;
    public Card parkingLot;
    public Card[] Deck;
    public int counter;
    public int counter2=2;
    public int randInt;
    public Player dealer;

    public Player[] players;

    public static void main(String[] args) {
        System.out.println("welcome to vegas!");
        Casino vegas = new Casino();
    }

    public Casino() {
        //aceHearts=new Card(1, 1);
        //aceHearts.printInfo();
        Deck = new Card[52];

        players = new Player[3];

        dealer = new Player(0);

        for (int i = 0; i < 3; i = i + 1) {
            players[i] = new Player(i + 1);
        }



        //use a loop to fill each individual element in the array
        System.out.println("Our OG Deck is below: ");
        for (int k = 0; k < 4; k = k + 1) {//outer loop changes suitNum
            for (int i = 1; i < 14; i = i + 1) {//inner loop changed carNum
                Deck[counter] = new Card(i, k);
                counter = counter + 1;
            }
        }

        for (int i = 0; i < 52; i = i + 1) {
            Deck[i].printInfo();
        }
        System.out.println();
        System.out.println("Our shuffled deck is below: ");
        shuffle();

        for (int i = 0; i < 52; i = i + 1) {
            Deck[i].printInfo();
        }
        System.out.println();

        deal();
        dealer.printInfo();
        for (int i = 0; i < 3; i = i + 1) {
            players[i].printInfo();
        }
    }

    public void shuffle(){
       // parkingLot=Deck[0];
      //  Deck[0]=Deck[1];
       // Deck[1]=parkingLot;
        //do this 52 times
        for(int i=0; i<52; i=i+1){
            randInt=(int)(Math.random()*52);
            parkingLot=Deck[i];
            Deck[i]=Deck[randInt];
            Deck[randInt]=parkingLot;
        }
    }

    public void deal(){
        dealer.hand[0]=Deck[0];
        dealer.hand[1]=Deck[1];

        for(int x=0; x<players.length; x=x+1){
            for(int y=0; y<players[x].hand.length; y=y+1) {
                players[x].hand[y] = Deck[counter2];
                counter2 = counter2 + 1;
            }
        }
    }
    //how to refer to a single player from player class
    //players[2]
    //how to refer to the 0th card in the hand of the 0th player
    //players[0].hand[0]


}
