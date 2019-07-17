import javax.swing.*;
import java.awt.*;

public class Slate extends JFrame {

    private int width;
    private int height;

    Container container;

    private JPanel sidebar;
    private DrawArea drawArea;



    public Slate(){

        width = 900;
        height = 600;

        container = getContentPane();
        container.setLayout(new BorderLayout());

        //add draw area
        drawArea = new DrawArea();

        //add sidebar
        sidebar = new SideBar(drawArea);

        container.add(sidebar, BorderLayout.WEST);

        drawArea.setPreferredSize(new Dimension(150, height));

        // add to content pane
        container.add(drawArea, BorderLayout.CENTER);

        setBackground(new Color(57,57,57));
        //size
        setSize(new Dimension(width,height));
        //start pos
        setLocationRelativeTo(null);
        //set default close action
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set title
        setTitle("Slate - Simple drawing app!");
        //disable resize
        //setResizable(false);
        setVisible(true);

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Slate();
            }
        });
    }
}
