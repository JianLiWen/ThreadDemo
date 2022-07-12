package waitNotify.size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenjianli
 * @date 2022/7/4 11:00 上午
 */
public class MyList {
    private static List list = new ArrayList<>();
    public static void add(){
        list.add("anything");
    }
    public static int  getSize(){
        return list.size();
    }
}
