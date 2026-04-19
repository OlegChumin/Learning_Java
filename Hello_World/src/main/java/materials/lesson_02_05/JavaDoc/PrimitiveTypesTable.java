package materials.lesson_02_05.JavaDoc;

public class PrimitiveTypesTable {

    public static void main(String[] args) {
        System.out.printf("%-15s %-20s %-20s %-20s\n", "Тип данных", "Разрядность (бит)", "Пример #1", "Пример #2", "Пример #3");
        for (PrimitiveType type : PrimitiveType.values()) {
            System.out.printf("%-15s %-20s %-20s %-20s %-20s\n", type.name(), type.getBitSize(),
                    type.getExampleValue(), type.getExampleValue(), type.getExampleValue());
        }
    }

    // Перечисление для представления примитивных типов данных
    private enum PrimitiveType {
        BYTE("byte", 8),
        SHORT("short", 16),
        INT("int", 32),
        LONG("long", 64),
        FLOAT("float", 32),
        DOUBLE("double", 64),
        CHAR("char", 16),
        BOOLEAN("boolean", 1);

        private final String typeName;
        private final int bitSize;

        PrimitiveType(String typeName, int bitSize) {
            this.typeName = typeName;
            this.bitSize = bitSize;
        }

        public String getBitSize() {
            return String.valueOf(bitSize);
        }

        public String getExampleValue() {
            switch (this) {
                case BYTE:
                    return "0";
                case SHORT:
                    return "0";
                case INT:
                    return "0";
                case LONG:
                    return "0L";
                case FLOAT:
                    return "0.0f";
                case DOUBLE:
                    return "0.0";
                case CHAR:
                    return "'a'";
                case BOOLEAN:
                    return "true";
                default:
                    return "";
            }
        }
    }
}
