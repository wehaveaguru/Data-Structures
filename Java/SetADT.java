import java.util.ArrayList;


interface Set<T> {
    void push(T elem);
    T access(int index);
    void delete(T elem);
    int size();
    
}


class MySet<T> implements Set<T> {
    private ArrayList<T> arr= new ArrayList<>();

    private boolean isEmpty(){
        return arr.isEmpty();
    }

    private boolean in(T elem){
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)==elem){
                return true;
            }
        }
        return false;
    }
    @Override
    public void delete(T elem){
        if (!isEmpty()){
            arr.remove(elem);
            
        }
        
    }
    @Override
    public void push(T elem){
        if (!in(elem)){
            arr.add(elem);
        }

        
    }
    @Override
    public T access(int index){
        return arr.get(index);
    }
    @Override
    public int size(){
        return arr.size();
    }


}

public class SetADT {
    public static void main(String args[]){
        MySet<Integer> set= new MySet<Integer>();
        set.push(1);
        System.out.println(set.access(0));
        
    }
}