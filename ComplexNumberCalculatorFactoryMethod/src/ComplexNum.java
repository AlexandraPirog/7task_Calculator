public class ComplexNum {
    /**
     * x- действительное число
     * y- мнимое число
     */
    private double x;
    private double y;

    /**
     *
     * @param x -действительная часть комплексного числа
     * @param y - мнимая часть комплексного числа
     */
    public ComplexNum(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getters & setters
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Преобразуем комплексное число в строковый вид
     * @return - возвращаем значение
     */
    @Override
    public String toString() {
        return String.format("( %.4f + i * %.4f)", x, y );
    }
}
