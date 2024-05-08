import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * @Author 申宇强
 * @Date 2024/5/8 下午10:54
 */
public class Demo {
    public static void main(String[] args) {
        //直接使用try-with-rehouse，省去close
        try (Jedis jedis = new Jedis("127.0.0.1", 6379)) {
            jedis.auth("123456");
            jedis.set("test", "shen");   //等同于 set test shen 命令
            System.out.println(jedis.get("test"));  //等同于 get test 命令
        }

    }

    //Hash类型的数据：
    @Test
    public void test() {
        try (Jedis jedis = new Jedis("127.0.0.1", 6379)) {
            jedis.auth("123456");
            jedis.hset("hhh", "name", "shen");   //等同于 hset hhh name sxc
            jedis.hset("hhh", "sex", "19");    //等同于 hset hhh age 19
            jedis.hgetAll("hhh").forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }

    @Test
//    列表操作
    public void test1() {
        try (Jedis jedis = new Jedis("127.0.0.1", 6379)) {
            jedis.auth("123456");
            jedis.lpush("mylist", "111", "222", "333");  //等同于 lpush mylist 111 222 333 命令
            jedis.lrange("mylist", 0, -1)
                    .forEach(System.out::println);    //等同于 lrange mylist 0 -1
        }
    }
}
