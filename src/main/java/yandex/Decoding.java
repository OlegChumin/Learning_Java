package yandex;

import java.util.Base64;

import static com.sun.org.apache.xml.internal.security.utils.XMLUtils.encodeToString;

public class Decoding {
    public static void main(String[] args) {
        String encodedUrl = "WWFuZGV4LkZpbnRlY2guQW5kcm9pZA==";
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
        String decodedUrl = new String(decodedBytes);
        System.out.println(decodedUrl);
    }
}
