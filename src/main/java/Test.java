import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄豪强
 * @create 2019/7/29 13:44
 */
public class Test {



    public static void main(String[] args) {
        UserProtoTyoe userProtoTyoe=new UserProtoTyoe();
        userProtoTyoe.setAge(18);
        userProtoTyoe.setUserName("黄豪强");
        List<String> a=userProtoTyoe.getList();
        a.add("我不是英雄");
        userProtoTyoe.setList(a);
        try {
            UserProtoTyoe userProtoType= (UserProtoTyoe) userProtoTyoe.clone();
            System.out.println(userProtoTyoe==userProtoType);
            System.out.println(userProtoTyoe.list==userProtoType.list);
            List<String>  list=new ArrayList<String>();
            list.add("黄豪强好帅");
            userProtoType.setList(list);
            System.out.println(userProtoType.getUserName()+":"+userProtoType.getAge()+":"+userProtoType.getList().get(0)+":"+userProtoTyoe.getList().get(0));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
