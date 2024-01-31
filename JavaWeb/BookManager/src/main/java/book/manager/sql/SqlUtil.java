package book.manager.sql;

import book.manager.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * @Author 申宇强
 * @Date 2024/1/31 15:59
 */
public class SqlUtil {
    private SqlUtil() {

    }

    private static SqlSessionFactory factory;

    static {
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSqlWork(Consumer<BookMapper> consumer) {
        try (SqlSession session = factory.openSession(true)) {
            BookMapper mapper = session.getMapper(BookMapper.class);
            consumer.accept(mapper);
        }
    }
}
