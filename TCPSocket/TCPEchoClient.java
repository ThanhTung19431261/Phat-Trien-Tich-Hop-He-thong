package TCPSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPEchoClient {
    public final static String svIP = "127.0.0.1";
    public final static int svPort = 7;

    public static void main(String[] args) throws InterruptedException, IOException {
        Socket s = null;
        try {
            s = new Socket(svIP, svPort);
            System.out.println("Client đã được tạo");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            for (int i = 0; i <= 9; i++) {
                os.write(i);
                int ch = is.read();
                System.out.println((char) ch);
                Thread.sleep(2000);
            }
        } catch (IOException ie) {
            // TODO: handle exception
            System.out.println("Không thể tạo socket");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
