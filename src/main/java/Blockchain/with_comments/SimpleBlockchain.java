package Blockchain.with_comments;// Импортируем необходимые библиотеки
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;

// Создаем класс Block для представления блока в блокчейне
class Block {
    // Определяем основные свойства блока
    public String hash; // хеш-сумма блока
    public String previousHash; // хеш-сумма предыдущего блока
    private String data; // данные, хранящиеся в блоке
    private long timeStamp; // метка времени создания блока

    // Конструктор блока, принимает данные и хеш-сумму предыдущего блока
    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime(); // записываем текущее время
        this.hash = calculateHash(); // вычисляем хеш-сумму блока
    }

    // Функция для вычисления хеш-суммы блока
    public String calculateHash() {
        String input = previousHash + Long.toString(timeStamp) + data; // формируем входную строку для хеширования
        return applySha256(input); // применяем алгоритм SHA-256 и возвращаем результат
    }

    // Функция для применения алгоритма SHA-256 к входной строке
    public static String applySha256(String input) {
        try {
            // Инициализируем объект MessageDigest с алгоритмом SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Вычисляем хеш-сумму входной строки
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            // Инициализируем строковый буфер для формирования результата
            StringBuffer hexString = new StringBuffer();

            // Перебираем массив байтов и конвертируем их в 16-ричный формат
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Возвращаем полученную хеш-сумму в виде строки
            return hexString.toString();
        } catch (Exception e) {
            // В случае ошибки выбрасываем исключение
            throw new RuntimeException(e);
        }
    }
}

// Главный класс программы
// Эти строки кода создают и добавляют блоки в блокчейн, а затем выводят информацию о каждом блоке. В приведенном
// примере создается простой блокчейн из трех блоков: генезис-блок, второй блок и третий блок. Каждый блок содержит
// ссылку на предыдущий блок, свою хеш-сумму и данные.
public class SimpleBlockchain {
    // Главная функция программы
    public static void main(String[] args) {
        // Создаем список для хранения блоков блокчейна
        ArrayList<Block> blockchain = new ArrayList<>();

        // Создаем и добавляем блоки в блокчейн
        Block genesisBlock = new Block("This is the genesis block", "0");
        // Добавляем первый блок (генезис-блок) в блокчейн
        blockchain.add(genesisBlock);

        // Создаем второй блок с данными и ссылкой на предыдущий блок (генезис-блок), затем добавляем его в блокчейн
        Block secondBlock = new Block("This is the second block", genesisBlock.hash);
        blockchain.add(secondBlock);

        // Создаем третий блок с данными и ссылкой на предыдущий блок (второй блок), затем добавляем его в блокчейн
        Block thirdBlock = new Block("This is the third block", secondBlock.hash);
        blockchain.add(thirdBlock);

        // Выводим информацию о блоках в блокчейне
        // Проходим по всем блокам в блокчейне с помощью цикла for-each
        for (Block block : blockchain) {
            // Выводим хеш текущего блока
            System.out.println("Hash: " + block.hash);
            // Выводим хеш предыдущего блока
            System.out.println("Previous Hash: " + block.previousHash);
            // Выводим пустую строку для разделения информации о блоках
            System.out.println();
        }
    }
}

