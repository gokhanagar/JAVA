package Generic;

public class G06DoubleParameterGeneric {
    public static void main(String[] args) {

        test<Integer, String> obj1 = new test<>(101, "beyza");
        //test<Integer, Integer> obj2 = new test<>(571,622);
        //test<String, String> obj3 = new test<>("102","arzu");
        System.out.println(obj1.getKey() + " " + obj1.getValue()); //101 beyza
    }
}

class test<K extends Number, V extends String> {
    // class test<K,V>{--> Generic Class'ta parametre istenirse sinirlandirilabilir}
    //Sinirlandirma icin istenen Data type Class'indan extends edilir. Bu isleme Parameter Bounding denir
    private K key;
    private V value;

    public test(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}