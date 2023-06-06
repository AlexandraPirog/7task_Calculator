public class Logger implements iRunOperationDecorator{
    private iRunOperation operation;

    public Logger(iRunOperation operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNum run(ComplexNum x, ComplexNum y) {
        ComplexNum result = operation.run(x, y);
        System.out.println(
                getDescription() + ": " + operation.getClass().getSimpleName() + " над комплексными числами " + x + " и " + y);
        System.out.println("Результат операции: " + result);
        return result;
    }

    @Override
    public String getDescription() {
        return "Выполняется операция";
    }
}
