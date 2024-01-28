import java.io.IOException;
import java.net.Socket;

/**
 * @Author 申宇强
 * @Date 2024/1/28 16:30
 */
public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("已连接到服务端！");
        } catch (IOException e) {
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
    }
}
