/**
 * Класс, представляющий калькулятор для работы с комплексными числами
 */
public class Calculator {
    private iRunOperation operation;
    /**
     * Метод для установки операции, которую нужно выполнить
     * @param operation операция, которую нужно выполнить
     */
    public void setOperation(iRunOperation operation) {
        this.operation = operation;
    }
    /**
     * Метод для выполнения операции над двумя комплексными числами
     * @param x первое комплексное число
     * @param y второе комплексное число
     * @return результат выполнения операции
     * @throws IllegalStateException если операция не установлена
     */
    public ComplexNum execute(ComplexNum x, ComplexNum y) {
        if (operation == null) {
            throw new IllegalStateException("Operation is not set");
        }
        return operation.run(x, y);
    }
}
