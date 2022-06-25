package common;

/**
 * @author wenjianli
 * @date 2022/6/22 11:24 上午
 */
public class StringAndSyn {
    public static void print(String str){
        try{
            synchronized (str){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
