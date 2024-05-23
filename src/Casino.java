public class Casino {
    //declaration section
    public Card aceHearts;
    public Card parkingLot;
    public Card[] Deck;
    public int counter;

    public static void main(String[] args) {
        System.out.println("welcome to vegas!");
        Casino vegas = new Casino();
    }

    public Casino(){
        //aceHearts=new Card(1, 1);
        //aceHearts.printInfo();
        Deck = new Card[52];

        //use a loop to fill each individual element in the array
        System.out.println("Our OG Deck is below: ");
        for(int k=0; k<4; k=k+1) {//outer loop changes suitNum
            for (int i = 1; i < 14; i = i + 1) {//inner loop changed carNum
                Deck[counter] = new Card(i, k);
                counter=counter+1;
            }
        }

        for(int i=0; i<52; i=i+1){
            Deck[i].printInfo();
        }
        System.out.println("Our shuffled deck is below: ");
        shuffle();


        for(int i=0; i<52; i=i+1){
            Deck[i].printInfo();
        }
    }

    public void shuffle(){
        parkingLot=Deck[0];
        Deck[0]=Deck[1];
        Deck[1]=parkingLot;
        //do this 52 times
        int r;
        r=(int)(Math.random()*53);
        for(int i=0; i<53; i=i+1){
            parkingLot=Deck[i];
            Deck[i]=Deck[r];
            Deck[r]=parkingLot;
        }

    }
}
