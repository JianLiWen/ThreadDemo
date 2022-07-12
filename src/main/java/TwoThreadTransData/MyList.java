package TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenjianli
 * @date 2022/7/1 4:00 下午
 */
public class MyList {
    private List list = new ArrayList<>();
    public void add(){
        list.add("wenjianli");
    }
    public int size() {
        return  list.size();
    }
}
