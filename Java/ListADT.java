



interface List<T>{
    void push(T elem);
    boolean pop();
    int size();
    boolean isEmpty();
    T access(int index);
}

class MyList<T> implements List<T>{
    public T[] data;
    public int size;
    private static int capacity;

    @SuppressWarnings("unchecked")
    public MyList(int c){
        capacity=c;
        data=(T[]) new Object[capacity];
        size=0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void push(T elem){
        if (size==capacity){
            throw new IllegalStateException("Array Full");
        }
        data[size]=elem;
        size++;
    }
    @Override
    public boolean pop(){
        if (isEmpty()){
            return false;
        }
        
        data[size-1]=null;
        size--;
        
        return true;
    }
    @Override
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }
    @Override
    public T access(int index){
        if (isEmpty()){
            throw new IllegalStateException("No elements in array");
        }
        return data[index];
    }
}





public class ListADT {
    public static void main(String args[]){
        MyList<Integer> arr= new MyList<Integer>(4);

        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.pop();
        System.out.println(arr.access(2));
        System.out.println(arr.size());

    }
}
