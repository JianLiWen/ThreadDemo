package common;

/**
 * @author wenjianli
 * @date 2022/6/20 9:29 下午
 */
public class MyOneService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try{
            synchronized (list){
                if (list.getSize() < 1){
                    Thread.sleep(2000); // 模拟从远程花费2秒取回数据
                    list.add(data);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
