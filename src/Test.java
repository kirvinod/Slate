import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class Test extends JFrame {

    public Test ()  {
        getContentPane().setLayout(new BorderLayout(0, 0));

        JSplitPane splitPane = new JSplitPane();
        getContentPane().add(splitPane, BorderLayout.CENTER);
        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);
        splitPane.resetToPreferredSizes();


        JLabel lblNewLabel = new JLabel("ddd");
        lblNewLabel.setMinimumSize(new Dimension(100, 80));
        splitPane.setLeftComponent(lblNewLabel);

        JLabel label = new JLabel("sss");
        label.setMinimumSize(new Dimension(100, 80));
        splitPane.setRightComponent(label);
    }

    public static void main(String[] args)  {
        Test a = new Test();
        a.setPreferredSize(new Dimension(1400, 900));
        a.pack();
        a.setVisible(true);
    }
}