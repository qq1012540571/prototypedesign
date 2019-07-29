import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄豪强
 * @create 2019/7/29 10:33
 */
public class Prototype implements Cloneable {
    public List<String> list=new ArrayList<String>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype=null;
        prototype= (Prototype) super.clone();
        prototype.list=new ArrayList<String>();
        return prototype;
    }
}
