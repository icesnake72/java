package fileio;

import java.io.Serializable;
import java.util.ArrayList;

public class Family <T> implements Serializable {
    private final ArrayList<T> list = new ArrayList<T>();

    public Family() {
    }

    public int add(T obj) {
        list.add( obj );
        return list.size();
    }

    public void showItems() {
        for(T obj : list) {
            System.out.println( obj );
        }
    }
}
