package generics;

import java.util.Arrays;

public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;

    public WildCardExample() {

        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = (num);
    }
    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] newData = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public T remove(){
        T remove = (T) data[--size];
        return remove;
    }

    public T get(int index){

        return (T) data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, T num) {
        data[index] = (Object) num;

    }


    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {


}

}
