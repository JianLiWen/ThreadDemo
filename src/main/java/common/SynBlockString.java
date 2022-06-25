package common;

/**
 * @author wenjianli
 * @date 2022/6/20 8:28 下午
 */
public class SynBlockString {
    private String userNameParam;
    private String passWordParam;
    private String anyString = new String();
    public void setUserNamePassword(String username,String password){
        try{
            synchronized (anyString){
                System.out.println("线程名称为："+ Thread.currentThread().getName() + "在" + System.currentTimeMillis() + " 进入同步块");
                userNameParam = username;
                Thread.sleep(3000);
                passWordParam = password;
                System.out.println("线程名称为："+ Thread.currentThread().getName()+"在" + System.currentTimeMillis() + "离开同步块");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
