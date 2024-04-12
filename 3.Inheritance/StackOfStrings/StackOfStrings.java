package L_03_P_04_StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList <String> data;

    public StackOfStrings(ArrayList<String> data) {
        this.data = new ArrayList<>();
    }

    public void push(String item){
        data.add(item);
    }
    public String pop(){
        return data.remove(data.size() - 1);
    }

    public String peek(){
        return data.get(data.size() - 1);
    }


}
