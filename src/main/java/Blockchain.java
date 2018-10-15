import java.util.ArrayList;

public class Blockchain {
    protected ArrayList<Block> blockchain = new ArrayList<>();

    void addBlock(Block block) {
        blockchain.add(block);
    }
}
