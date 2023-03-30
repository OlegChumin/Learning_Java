package Blockchain;
/**
 * Blockchain (цепочка блоков) - это распределенная и децентрализованная технология, которая позволяет хранить данные в
 * виде непрерывной последовательности блоков. Каждый блок содержит информацию (например, транзакции) и ссылку на
 * предыдущий блок в цепочке. Это обеспечивает устойчивость к манипуляциям и защиту от подделки данных.
 *
 * Основные особенности блокчейна:
 *
 * Децентрализация: Данные в блокчейне хранятся на множестве компьютеров (узлов) сети, что обеспечивает отсутствие
 * единой точки отказа и снижает риск атаки на систему.
 * Прозрачность: Все транзакции и блоки в блокчейне являются общедоступными, и любой участник сети может просмотреть
 * всю историю транзакций.
 * Безопасность: Благодаря криптографическим алгоритмам и механизму консенсуса (например, Proof of Work или Proof of
 * Stake), изменить записи в блокчейне практически невозможно.
 * Неизменность: Как только блок добавлен в блокчейн, его сложно изменить или удалить, что обеспечивает защиту от
 * мошенничества и подделки данных.
 * Блокчейн стал основой многих криптовалют, таких как Bitcoin, Ethereum и других, но технология также применяется в
 * других отраслях, включая финансы, медицину, логистику, управление цепочками поставок и многое другое.
 */

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;

class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String input = previousHash + Long.toString(timeStamp) + data;
        return applySha256(input);
    }

    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class SimpleBlockchain {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();

        // Создаем блоки и добавляем их в блокчейн
        Block genesisBlock = new Block("This is the genesis block", "0");
        blockchain.add(genesisBlock);

        Block secondBlock = new Block("This is the second block", genesisBlock.hash);
        blockchain.add(secondBlock);

        Block thirdBlock = new Block("This is the third block", secondBlock.hash);
        blockchain.add(thirdBlock);

        // Выводим информацию о блоках в блокчейне
        for (Block block : blockchain) {
            System.out.println("Hash: " + block.hash);
            System.out.println("Previous Hash: " + block.previousHash);
            System.out.println();
        }
    }
}
