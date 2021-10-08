public class CardMain {
    public static void main(String[] args) {
        Card[] arr = new Card[52];
        int val = 0;
        String[] shape = {"spade", "heart", "diamond", "clover"};
        for(int i=0; i<shape.length; i++){
            for(int j=1; j<=13; j++){
                String str;
                switch(j){
                    case 1 :
                        str = "A";
                        break;
                    case 11 :
                        str = "J";
                        break;
                    case 12 :
                        str = "Q";
                        break;
                    case 13 :
                        str = "K";
                        break;
                    default:
                        str = String.valueOf(j);

                }
                Card c = new Card(shape[i], str);
                arr[val] = c;
                val++;
            }

        }
        for(int i=0; i<52; i++){
            System.out.println(arr[i]);
        }
        Card c1 = new Card("spade","K");
        System.out.println(c1);
        Card c2 = new Card("heart", "2");
        System.out.println(c2);


    }


}
