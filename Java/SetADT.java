import java.util.ArrayList;

import javax.management.RuntimeErrorException;
public interface Set<T> {
    void remove(T elem);
    void add(T elem);
    T access(int index);
    void display();
    
}


class MySet<T> implements Set<T> {
    private ArrayList<T> arr= new ArrayList<>();

    private boolean isEmpty(){
        if (arr.size()==0){
            throw new RuntimeErrorException("Set is empty");
        }
        else{
            return false;
        }
    }

    private boolean in(T elem){
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)==elem){
                return true;
            }
        }
        return false;
    }
    public T delete(T elem){
        if (!isEmpty()){
        
            T elemt=arr.remove(elem);
            return elemt;
        }
    }

    public void push(T elem){
        if (in(elem)){
            //nothing
        }

        else{
            arr.add(elem);
        }
    }

    public T access(int index){
        return arr.get(index);
    }

    public int size(){
        return arr.size();
    }


}

public class Main implements Set{
    public static void main(String args[]){
        MySet<Integer> set= new MySet<Integer>();
        set.push(1);
        System.out.println(set.access(0));
        
    }
}