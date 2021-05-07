import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame2
    extends JFrame
    implements ActionListener {
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MyFrame2 frame2 = new MyFrame2();
                    frame2.setVisible(true);
                    }
                    });
        }

    // Components of the Form
    private Container c;
    private JLabel title;
    private JButton sub;
    private JTextArea tout;
    private JLabel Tid;
    private JPanel contentPane;
    
    public void setID(String str){
        Tid.setText(str);
        System.out.println(Tid.getText().toString());
    }
    // constructor, to initialize the components
    // with default values.
    public MyFrame2()
    {
        setTitle("Stou-TEC");
        setBounds(240,0, 1000, 820);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        Font font = new Font("SF Mono" , Font.BOLD , 14);
        c = getContentPane();
        c.setLayout(null);

        JPanel panel = new JPanel();
		panel.setBounds(288, 10, 410, 115);
		c.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

        title = new JLabel("รายละเอียดของผู้สมัคร");
        title.setFont(new Font("TH Sarabun New", Font.PLAIN, 20));
        title.setSize(300, 30);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title);

        setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

        Tid = new JLabel();
        Tid.setBounds(100, 38, 93, 14);
        contentPane.add(Tid);

        sub = new JButton("แก้ไข");
        sub.setFont(font);
        sub.setSize(100, 20);
        sub.setLocation(150, 750);
        sub.setBounds(472, 746, 66, 21);
        sub.addActionListener(this);
        c.add(sub);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(500, 500);
        tout.setLocation(100, 200);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            MyFrame frame = new MyFrame();
            frame.setVisible(true);
            setVisible(false);
        }
        else {
            String def = "1";
        }
    }
}