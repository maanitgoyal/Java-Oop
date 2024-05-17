//package generics;
//
//import java.util.Arrays;
//
//public class ArrayList {
//
//    private int[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size;
//
//    public ArrayList() {
//        this.data = new int[DEFAULT_SIZE];
//    }
//
//    public void add(int num){
//        if (isFull()){
//            resize();
//        }
//        data[size++] = num;
//    }
//    private boolean isFull(){
//        return size == data.length;
//    }
//    private void resize(){
//        int[] newData = new int[data.length * 2];
//        for(int i = 0; i < data.length; i++){
//            newData[i] = data[i];
//        }
//        data = newData;
//    }
//
//    public int remove(){
//        int remove = data[--size];
//        return remove;
//    }
//
//    public int get(int index){
//        return data[index];
//    }
//    public int size(){
//        return size;
//    }
//
//    public void set(int index, int num){
//        // this function is made by kunal
//        //data[index] = num;
//        //this by me
//
//        if(data[index] != 0){
//            data[index] = num;
//        }
//        else {
//            data[index] = num;
//            size++;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "ArrayList{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        System.out.println(arr);
//        System.out.println(arr.remove());
//        System.out.println(arr.size());
//        System.out.println(arr.get(3));
//        arr.add(10);
//        arr.set(4,9);
//        System.out.println(arr.get(5));
//        System.out.println(arr);
//    }
//}
