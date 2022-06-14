package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 9:26 上午
 */
public class HasSelfPrivateNum {
    private int num=0;
    synchronized public void addl(String username){
        try {
            if (username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
