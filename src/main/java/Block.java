import java.util.Objects;

public class Block {
    protected int previousHash;
    protected String transactions[];
    protected int hash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        hash = Objects.hash(previousHash, transactions);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getHash() {
        return hash;
    }
}
