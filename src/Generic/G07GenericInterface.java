package Generic;

public class G07GenericInterface {
    public static void main(String[] args) {

        usAllClass<Float> floatUs = new usAllClass<>();
        System.out.println(floatUs.usAl(5f, 2f));

        usAllClass<Integer> intUs = new usAllClass<>();
        System.out.println(intUs.usAl(4, 3));

        usAllClass<Double> dbUs = new usAllClass<>();
        System.out.println(dbUs.usAl(2.1, 4.1));


    }
}

//Generic Interface
interface MathIslem<T extends Number> {
    double usAl(T t, T u);
}

//Generic class Generic interface'den usAl() method implement edildi
class usAllClass<T extends Number> implements MathIslem<T> {

    @Override
    public double usAl(T t, T u) {
        return Math.pow(t.doubleValue(), u.doubleValue());
    }
}


























