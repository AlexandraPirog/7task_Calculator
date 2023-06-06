public class OperationDivision implements iRunOperation {
    /**
     * Деление
     * Z= z1/z2=((x1*x2)+(y1*y2)+ i*(x2y1- x1y2))/(x2*x2 + y2*y2)
     */

    @Override
    public ComplexNum run(ComplexNum x, ComplexNum y) {
        double denominator = y.getX() * y.getX() + y.getY() * y.getY();
        // Вычисляем действительную часть результата
        double real = (x.getX() * y.getX() + x.getY() * y.getY()) / denominator;
        // Вычисляем мнимую часть результата
        double imaginary = (x.getY() * y.getX() - x.getX() * y.getY()) / denominator;
        // Возвращаем новое комплексное число
        return new ComplexNum(real, imaginary);
    }
}
