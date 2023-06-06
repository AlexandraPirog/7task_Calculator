public abstract class OperationGenerator {
    /**
     * Класс-фабрика, вызывает операции
     */

    public static iRunOperation createOperation(String type) {
        switch (type) {
            case "addition":
                return new OperationSum();
            case "multiplication":
                return new OperationMulti();
            case "division":
                return new OperationDivision();
            default:
                throw new IllegalArgumentException("Неизвестный тип операции: " + type);
        }
    }
}
