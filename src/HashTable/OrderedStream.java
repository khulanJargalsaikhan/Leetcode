package HashTable;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    public static void main(String[] args){
        OrderedStream os = new OrderedStream(5);
        System.out.println(os.insert(3,"ccccc"));
        System.out.println(os.insert(1,"aaaaa"));
        System.out.println(os.insert(2,"bbbbb"));
        System.out.println(os.insert(5,"eeeee"));
        System.out.println(os.insert(4,"ddddd"));

    }

    int ptr = 0;
    String[] arr;
    public OrderedStream(int n) {
        arr = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        arr[idKey-1] = value;
        while(ptr < arr.length && arr[ptr] != null){
            list.add(arr[ptr]);
            ptr++;
        }
        return list;
    }
}

