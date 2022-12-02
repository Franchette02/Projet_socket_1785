
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("miandry client oh");
        Socket socket = serverSocket.accept();
        System.out.println("connecte ny client");
        DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInput = new DataInputStream(socket.getInputStream());
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String message = "";
        while (!message.equals("stop")) {
            
        }
        {
            System.out.println("Client: "+dataInput.readUTF());
            System.out.print("Moi : ");
            String monMessage = reader.readLine();
            dataOutput.writeUTF(monMessage);
            System.out.println();
        }
    }
}
