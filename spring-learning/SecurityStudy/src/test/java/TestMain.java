import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author 申宇强
 * @Date 2024/3/15 14:22
 */
public class TestMain {
    @Test
    public void passwordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
