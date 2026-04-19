package lesson_01.hashcode;

import java.util.UUID;

public class HashCodeString {

    private final char[] value;

    public HashCodeString(char[] value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (int i = 0; i < value.length; i++) {
            h = 31 * h + value[i];
        }
        return super.hashCode();
    }
}
