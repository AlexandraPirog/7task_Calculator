public class OperationMulti implements iRunOperation {

    /**
     * Умножение
     * z = x + iy
     * Z = z * z = (( x * x ) - (y * y)) +(( x * y ) + ( y * x ) * i)
     */

    @Override
    public ComplexNum run(ComplexNum x, ComplexNum y) {
        return new ComplexNum(x.getX() * y.getX() - x.getY() * y.getY(),
                x.getX() * y.getY() + x.getY() * y.getX());
    }
}
