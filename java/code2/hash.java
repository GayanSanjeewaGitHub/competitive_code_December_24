import java.util.ArrayList;
 import java.util.List;

class MyHashMap {
    private static final int kSize = 10000;
    List<int[]>[] lists;
    public MyHashMap() {
        lists = new List[kSize];

        for (int i = 0; i < kSize; ++i)
            lists[i] = new ArrayList<>();
    }


    public void put(int key, int value) {
        System.out.println( key % kSize);
        for (int[] pair : lists[key % kSize])
            if (pair[0] == key) {
                pair[1] = value;
                System.out.println("used which is already"+ key);
                return;
            }
        lists[key % kSize].add(new int[] {key, value});
    }


    public int get(int key) {
        for (int[] pair : lists[key % kSize])
            if (pair[0] == key)
                return pair[1];
        return -1;
    }


    public void remove(int key) {
        for (int i = 0; i < lists[key % kSize].size(); ++i)
            if (lists[key % kSize].get(i)[0] == key) {
                lists[key % kSize].remove(i);
                return;
            }
    }


}



class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(10000 , 1);
        myHashMap.put(20000 , 2);
        myHashMap.put(30000 , 3);
        myHashMap.put(20000 , 3);
        System.out.println(myHashMap.get(10000  ));










    }

}