package common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenjianli
 * @date 2022/6/20 9:27 下午
 */
public class MyOneList {
    private List list = new ArrayList<>();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return  list.size();
    }
}
