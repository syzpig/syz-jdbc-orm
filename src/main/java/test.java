import com.alibaba.fastjson.JSON;
import com.syz.jdbc.demo.dao.MemberDao;

public class test {
    public static void main(String[] args) {
        MemberDao memberDao=new MemberDao();
        System.out.println(JSON.toJSON(memberDao.selectByName("zhangsan")));
    }
}
