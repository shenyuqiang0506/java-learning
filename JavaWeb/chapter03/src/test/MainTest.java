package test;

import com.bean.User;
import com.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * @Author 申宇强
 * @Date 2024/1/30 18:00
 */
public class MainTest {
    @Test
    public void method() {
        System.out.println("我是测试用例1");
    }

    @Test
    public void method2() {
        System.out.println("我是测试用例2");
    }

    @Test
    public void method3() {
        System.out.println("我是测试案例！");
        Assert.assertEquals(1, 1);    //参数1是期盼值，参数2是实际测试结果值
    }

    @Test
    public void method4() {
        int[] arr = {0, 4, 5, 2, 6, 9, 3, 1, 7, 8};

        //错误的冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
//                     arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() {
        System.out.println("测试前置正在初始化...");
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(new FileInputStream("mybatis-config.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("测试初始化完成，正在开始测试案例...");
    }

    @Test
    public void method01() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            User user = (User) mapper.selectUser();

            Assert.assertEquals(new User().setId(1).setName("小明").setPassword("123456"), user);
            System.out.println("测试用例1通过！");
        }
    }

    @Test
    public void method02() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            System.out.println("测试用例2通过！");
        }
    }
    @After
    public void after(){
        System.out.println("测试结束，收尾工作正在进行...");
    }
}
