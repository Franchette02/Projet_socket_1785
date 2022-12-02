
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {  
        Socket socket = new Socket("localhost", 5555);
        System.out.println("efa connectee");
        DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInput = new DataInputStream(socket.getInputStream());
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String message = "";

        while(!message.equals("stop stop"))
        {
            System.out.print("Moi : ");
            String monMessage = reader.readLine();
            dataOutput.writeUTF(monMessage);
            System.out.println("Server: " +dataInput.readUTF());
            System.out.println();
        }

    }
}
