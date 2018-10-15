import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlockTestSuite {

    @Test
    public void testBlock() {
        int previousHash = 10;
        int expectedHash = 1323469501;
        String[] transactions = { "Mock transaction 1", "Mock transaction 2" };
        Block firstBlock = new Block(previousHash, transactions);
        assertEquals(firstBlock.getPreviousHash(), previousHash);
        assertEquals(firstBlock.getHash(), expectedHash);
    }

    @Test
    public void testBlockchain() {
        int previousHash = 10;
        int expectedHash = 1030871625;
        String[] transactions = { "Mock transaction 1", "Mock transaction 2" };
        Block firstBlock = new Block(previousHash, transactions);
        BlockchainMock blockchain = new BlockchainMock();
        blockchain.addBlock(firstBlock);
        assertEquals(blockchain.getBlockchain().size(), 1);
    }
}
