import java.util.Objects;

public class Main {

    public static void main(String args[]) {
        Block firstBlock = new Block(0, new String[]{"Andrew send 0.5 btc to Satoschi", "Henry send 0.1 btc to Juliet"});
        Block secondBlock = new Block(Objects.hash(firstBlock.getHash(), firstBlock.getTransactions()), new String[] {"Jack send 0.2 btc to Emma"});
        Block thirdBlock = new Block(Objects.hash(secondBlock.getHash(), secondBlock.getTransactions()), new String[] {"John send 0.7 btc to Amy"});

        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(firstBlock);
        blockchain.addBlock(secondBlock);
        blockchain.addBlock(thirdBlock);
    }
}
