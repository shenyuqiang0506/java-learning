
import com.test.mapper.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
/**
 * @Author 申宇强
 * @Date 2024/1/30 20:58
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        try(SqlSession session = factory.openSession(true)) {
            TestMapper mapper = session.getMapper(TestMapper.class);
            System.out.println(mapper.getUserById(1));
        }

    }
}
