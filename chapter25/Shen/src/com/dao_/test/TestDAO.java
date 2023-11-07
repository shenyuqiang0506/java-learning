package com.dao_.test;

import com.dao_.damain.Actor;
import com.dao_.dao.ActorDAO;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2023/8/4 14:24
 */
@SuppressWarnings({"all"})
public class TestDAO {
    @Test
    //测试ActorDAO 对actor表crud操作
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();
        //1.查询
        List<ActorDAO> actors =
                actorDAO.queryMulti("select * from actor where id >= ?", ActorDAO.class, 1);
        System.out.println("===查询结果===");
        for (ActorDAO actor : actors) {
            System.out.println(actor);
        }
        //2. 查询单行记录
        ActorDAO actor = actorDAO.querySingle("select * from actor where id = ?", ActorDAO.class, 1);
        System.out.println("====查询单行结果====");
        System.out.println(actor);
    }
}
