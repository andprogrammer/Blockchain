import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlockTestSuite {

    @Test
    public void testBlock() {
        int hash = 24832;
        String transactions = "Mock transactions";
        Block firstBlock = new Block(hash, transactions);
        assertEquals(firstBlock.getHash(), hash);
        assertEquals(firstBlock.getTransactions(), transactions);
    }
}
