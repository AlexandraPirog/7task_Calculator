public class OperationSum implements iRunOperation {

    /**
     * Сложение
     * z = x + iy
     * Z = z+z = ( x + x ) +(y + y) * i
     */

    @Override
    public ComplexNum run(ComplexNum x, ComplexNum y) {
        return new ComplexNum(x.getX() + y.getX(), x.getY() + y.getY());
    }
}
