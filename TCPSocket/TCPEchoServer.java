package TCPSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
    public final static int svPort = 12;

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(svPort);
            System.out.println("Server đã được tạo");
            while (true) {
                try {
                    Socket s = ss.accept();
                    InputStream is = s.getInputStream();
                    OutputStream os = s.getOutputStream();
                    int ch = 0;
                    while (true) {
                        ch = is.read();
                        if (ch == -1) {
                            break;
                        }
                        System.out.println(char(ch));
                        os.write(ch);
                    }
                    s.close();
                } catch (IOException ie1) {
                    //TODO: handle exception
                    System.out.println("Lỗi kết nối: " + ie1);
                }
            }
        } catch (IOException ie) {
            //TODO: handle exception
            System.out.println("Không thể tạo server: " + ie);
        }
    }
}
