import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String args[]) {
//        ArrayList<Block> blockchain = new ArrayList<>();  //TODO create separate Blockchain class
        Block firstBlock = new Block(0, new String[]{"Andrew send 0.5 btc to Satoschi", "Henry send 0.1 btc to Juliet"});
        Block secondBlock = new Block(Objects.hash(firstBlock.getHash(), firstBlock.getTransactions()), new String[] {"Jack send 0.2 btc to Emma"});
        Block thirdBlock = new Block(Objects.hash(secondBlock.getHash(), secondBlock.getTransactions()), new String[] {"John send 0.7 btc to Amy"});

        System.out.println("first block hash=" + firstBlock.getHash());
        System.out.println("second block hash=" + secondBlock.getHash());
        System.out.println("third block hash=" + thirdBlock.getHash());
    }
}
