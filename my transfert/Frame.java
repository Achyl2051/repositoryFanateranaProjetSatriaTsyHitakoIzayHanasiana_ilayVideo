package windows;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

public class Frame extends JFrame
{
    public void sendFile()
    {
        Panel jo=new Panel(this);
        this.add(jo.send());
        this.setTitle("My Transfert");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}