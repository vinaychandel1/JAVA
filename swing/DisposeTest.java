import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class DisposeTest
{
    JFrame f;
    JDialog dialog;
    int count;
  
    public DisposeTest()
    {
        count = 0;
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(getUIPanel(), "North");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setVisible(true);
    } 
  
    private void showDialog()
    {
        if(dialog == null)
        {
            dialog = new JDialog(f, "dialog " + ++count, false);
            dialog.setSize(200,100);
            dialog.setLocationRelativeTo(f);
        }
        dialog.setVisible(true);
        dialog.toFront();
    }
  
    private JPanel getUIPanel()
    {
        final JButton
            show    = new JButton("show"),
            dispose = new JButton("dispose"),
            remove  = new JButton("remove");
        ActionListener l = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JButton button = (JButton)e.getSource();
                if(button == show)
                    showDialog();
                if(button == dispose)
                    dialog.dispose();
                if(button == remove)
                {
                    dialog.dispose();
                    dialog = null;
                }
            }
        };
        show.addActionListener(l);
        dispose.addActionListener(l);
        remove.addActionListener(l);
        JPanel panel = new JPanel();
        panel.add(show);
        panel.add(dispose);
        panel.add(remove);
        return panel;
    }
  
    public static void main(String[] args)
    {
        new DisposeTest();
    }
}