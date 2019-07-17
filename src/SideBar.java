import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideBar extends JPanel implements ActionListener {

    private JButton penBtn, markerBtn,highlighterBtn, clearBtn;

    public SideBar(DrawArea drawArea){

        penBtn = new JButton("Pen");
        penBtn.addActionListener(this);
        add(penBtn);

        markerBtn = new JButton("Marker");
        markerBtn.addActionListener(this);
        add(markerBtn);

        highlighterBtn = new JButton("Highlighter");
        highlighterBtn.addActionListener(this);
        add(highlighterBtn);

        clearBtn = new JButton("Clear all");
        clearBtn.addActionListener(this);
        add(clearBtn);

        setBackground(new Color(57,57,57));
        setPreferredSize(new Dimension(200, 100));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearBtn) {
            //drawArea.clear();
        }


    }
}
