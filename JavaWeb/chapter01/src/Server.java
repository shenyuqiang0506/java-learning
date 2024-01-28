import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author 申宇强
 * @Date 2024/1/28 16:31
 */
public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {    //将服务端创建在端口8080上
            System.out.println("正在等待客户端连接...");
            while (true) {   //无限循环等待客户端连接
                Socket socket = server.accept();
                System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());
            }
//            Socket socket = server.accept();  //当没有客户端连接时，线程会阻塞，直到有客户端连接为止
//            System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
