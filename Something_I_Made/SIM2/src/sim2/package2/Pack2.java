package sim2.package2;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;

/**
 * Created by Danny on 2/4/2018.
 */
public class Pack2 {

    //JFrame frame;
    private String title;
    private int height, width;

    public Pack2(String title, int width, int height){
        this.title = title;
        this.height = height;
        this.width = width;

        CreateDisplay();
    }

    public void CreateDisplay(){
        JFrame frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
