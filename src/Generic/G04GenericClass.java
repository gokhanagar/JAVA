package Generic;

public class G04GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //parametresiz generic cons
    public G04GenericClass() {

    }

    //parametreli generic cons
    public G04GenericClass(T data) {
        this.data = data;
    }


    public static void main(String[] args) {

        //generic class'tan obje create edildi.
        G04GenericClass<Integer> intData = new G04GenericClass<>(1453);
        System.out.println("intData.getData() = " + intData.getData());

        G04GenericClass<Double> dbData = new G04GenericClass<>(571.622);
        System.out.println("dbData.getData() = " + dbData.getData());

        G04GenericClass<String> strData = new G04GenericClass<>("selam");
        System.out.println("strData.getData() = " + strData.getData());

        //  G04GenericClass<String> strData1 = new G04GenericClass<>(23); CTE verir


    }


}
