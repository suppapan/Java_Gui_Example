// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
    extends JFrame
    implements ActionListener {

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MyFrame frame = new MyFrame();
                    frame.setVisible(true);
                    }
                    });
        }

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel title2;
    private JLabel title3;
    private JLabel title4;
    private JRadioButton male;
    private JRadioButton female;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    public JTextField tid;
    private JTextField tname ;
    private JTextField taddr ;
    private JTextField tprovince ;
    private JTextField teducate ;
    private JTextField tmaj ;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;


    private String know[]
        = { "เลือกความรู้ความสามารถ", "ASP : Web_ASP", "C++ : C++", "DB2 : Database Administrator, DB2", "DBA_OR : Database Administrator, ORACLE", "GRP_DS : Graphic Design", "JAVA :  JAVA", "MGT : Management", "NW : Network", "SE_45 : Secretarial work, 45 words/min", "SE_60 : Secretarial work, 60 words/min", "SYS_1 : System Analyst, Level 1", "SYS_2 : System Analyst, Level 2", "VB : Visual Basic"};
    private String want[]
        = { "เลือกตำแหน่งที่ต้องการสมัคร", "PS001 : Technical Programmer", "PS002 : Web Developer", "PS003 : General Manager", "PS004 : ICT Specialist", "PS005 : E-Business Analyst", "PS006 : ICT Document", "PS007 : Database Administrator", "PS008 : PC Administrator", "PS009 : Network Specialist", "PS010 : ICT Manager"};

    // constructor, to initialize the components
    // with default values.


    public MyFrame()
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

        title = new JLabel("บริษัท STOU-TEC");
        title.setFont(new Font("TH Sarabun New", Font.PLAIN, 20));
        title.setSize(300, 30);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title);

        title2 = new JLabel("แบบฟอร์มใบสมัครพนักงาน");
        title2.setFont(new Font("TH Sarabun New", Font.PLAIN, 20));
        title2.setSize(300, 30);
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title2);

        title3 = new JLabel("บริษัท STOU-TEC จำกัด ทำการคัดเลือกตามความเหมาะสม");
        title3.setFont(new Font("TH Sarabun New", Font.PLAIN, 20));
        title3.setSize(300, 30);
        title3.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title3);

        title4 = new JLabel("ใบสมัครสำหรับงานด้าน ICT นี้ ให้ผู้สมัรกรอกรายละเอียดต่อไปนี้เพื่อที่ \r\n");
        title4.setFont(new Font("TH Sarabun New", Font.PLAIN, 20));
        title4.setSize(300, 30);
        title4.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title4);

        JLabel id = new JLabel("เลขประจำตัวของผู้สมัคร (AP_ID) : ");
		id.setBounds(20, 130, 250, 13);
		id.setFont(font);
        id.setSize(300,20);
		c.add(id);

        tid = new JTextField();
        tid.setBounds(300, 129, 300, 19);
		c.add(tid);
		tid.setColumns(10);
		
		JLabel name = new JLabel("ชื่อ-นามสกุล (AP_NAME)");
		name.setBounds(20, 160, 167, 13);
		name.setFont(font);
        name.setSize(300,20);
		c.add(name);

        tname = new JTextField();
		tname.setBounds(300, 159, 300, 19);
		c.add(tname);
		tname.setColumns(10);
		
		JLabel addr = new JLabel("ที่อยู่ (AP_ADDRESS) :");
		addr.setBounds(20, 190, 250, 13);
		addr.setFont(font);
        addr.setSize(300,20);
		c.add(addr);

        taddr = new JTextField();
		taddr.setBounds(300, 189, 300, 19);
		c.add(taddr);
		taddr.setColumns(10);
		
		JLabel province = new JLabel("จังหวัด (AP_CHW)");
		province.setBounds(20, 220, 132, 13);
		province.setFont(font);
        province.setSize(300,20);
		c.add(province);

        tprovince = new JTextField();
		tprovince.setBounds(300, 219, 120, 19);
		c.add(tprovince);
		tprovince.setColumns(10);
		
		JLabel sexd = new JLabel("เพศ (AP_SEX): ");
		sexd.setBounds(20, 250, 160, 13);
		sexd.setFont(font);
        sexd.setSize(300,20);
		c.add(sexd);
		
		JLabel educate = new JLabel("วุฒิการศึกษาชั้นสูงสุด (AP_ED) : ");
		educate.setBounds(20, 280, 160, 21);
		educate.setFont(font);
        educate.setSize(300,20);
		c.add(educate);
		
		JLabel newtil = new JLabel("เช่น (B.S,B.A,M.S.,M.BA.,M.A) : ");
		newtil.setBounds(30, 300, 160, 13);
		newtil.setFont(font);
        newtil.setSize(300,20);
		c.add(newtil);
		
        teducate = new JTextField();
		teducate.setBounds(300, 279, 120, 19);
		c.add(teducate);
		teducate.setColumns(10);

		JLabel maj = new JLabel("วิชาเอก (AP_MAJ) :");
		maj.setBounds(20, 330, 132, 13);
		maj.setFont(font);
        maj.setSize(300,20);
		c.add(maj);

        tmaj = new JTextField();
		tmaj.setBounds(300, 329, 120, 19);
		c.add(tmaj);
		tmaj.setColumns(10);
		
		male = new JRadioButton("ชาย");
        male.setBounds(300, 242, 120, 27);
		c.add(male);
		
		female = new JRadioButton("หญิง");
        female.setBounds(350, 242, 120, 27);
		c.add(female);
        
        JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 385, 657, 154);
		c.add(panel_2);
		panel_2.setLayout(null);

        JLabel lblNewLabel = new JLabel("ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC)(ตอบได้ไม่เกิน 5 รายการ)");
		lblNewLabel.setBounds(12, 5, 582, 17);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(font);
		
		JLabel atb1 = new JLabel("ความรู้ความสามารถ 1");
		atb1.setBounds(12, 32, 100, 20);
		atb1.setFont(font);
        atb1.setSize(300,20);
		panel_2.add(atb1);

        comboBox1 = new JComboBox(know);
		comboBox1.setBounds(300, 32, 166, 18);
		comboBox1.setSize(300,20);
		panel_2.add(comboBox1);
		
		JLabel atb2 = new JLabel("ความรู้ความสามารถ 2");
		atb2.setBounds(12, 55, 100, 20);
		atb2.setFont(font);
        atb2.setSize(300,20);
		panel_2.add(atb2);

        comboBox2 = new JComboBox(know);
		comboBox2.setBounds(300, 55, 166, 18);
		comboBox2.setSize(300,20);
		panel_2.add(comboBox2);
		
		JLabel atb3 = new JLabel("ความรู้ความสามารถ 3");
		atb3.setBounds(12, 78, 100, 20);
		atb3.setFont(font);
        atb3.setSize(300,20);
		panel_2.add(atb3);

        comboBox3 = new JComboBox(know);
		comboBox3.setBounds(300, 78, 166, 18);
		comboBox3.setSize(300,20);
		panel_2.add(comboBox3);
		
		JLabel atb4 = new JLabel("ความรู้ความสามารถ 4");
		atb4.setBounds(12, 101, 100, 20);
		atb4.setFont(font);
        atb4.setSize(300,20);
		panel_2.add(atb4);

        comboBox4 = new JComboBox(know);
		comboBox4.setBounds(300, 101, 166, 18);
		comboBox4.setSize(300,20);
		panel_2.add(comboBox4);
		
		JLabel atb5 = new JLabel("ความรู้ความสามารถ 5");
		atb5.setBounds(12, 124, 100, 20);
		atb5.setFont(font);
        atb5.setSize(300,20);
		panel_2.add(atb5);

        comboBox5 = new JComboBox(know);
		comboBox5.setBounds(300, 124, 166, 18);
		comboBox5.setSize(300,20);
		panel_2.add(comboBox5);

        JPanel panel3 = new JPanel();// L , N , R , B
		panel3.setBounds(10, 555, 700, 150); //385, 657, 184
		c.add(panel3);
		panel3.setLayout(null);

        JLabel Label2 = new JLabel("ตำแหน่งที่ต้องการสมัคร (POS_NAME) :  (ตอบได้ไม่เกิน 3 ตำแหน่ง)");
        Label2.setSize(300,20);
		Label2.setBounds(12, 5, 582, 17);
		panel3.add(Label2);
		Label2.setFont(font);
		
		JLabel tb1 = new JLabel("ความรู้ความสามารถ 1");
		tb1.setBounds(12, 22, 100, 20);
		tb1.setFont(font);
        tb1.setSize(300,20);
		panel3.add(tb1);

        combo1 = new JComboBox(want);
		combo1.setBounds(300, 32, 166, 18);
		combo1.setSize(300,20);
		panel3.add(combo1);

        JLabel tb2 = new JLabel("ความรู้ความสามารถ 2");
		tb2.setBounds(12, 52, 100, 20);
		tb2.setFont(font);
        tb2.setSize(300,20);
		panel3.add(tb2);

        combo2 = new JComboBox(want);
		combo2.setBounds(300, 55, 166, 18);
		combo2.setSize(300,20);
		panel3.add(combo2);

        JLabel tb3 = new JLabel("ความรู้ความสามารถ 3");
		tb3.setBounds(12, 82, 100, 20);
		tb3.setFont(font);
        tb3.setSize(300,20);
		panel3.add(tb3);

        combo3 = new JComboBox(want);
		combo3.setBounds(300, 78, 166, 1);
		combo3.setSize(300,20);
		panel3.add(combo3);

        sub = new JButton("ตกลง");
        sub.setFont(font);
        sub.setSize(100, 20);
        sub.setLocation(150, 750);
        sub.setBounds(472, 746, 66, 21);
        sub.addActionListener(this);
        c.add(sub);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(690, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);


        setVisible(true);
    }  
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String str = tid.getText();
                MyFrame2 obj = new MyFrame2();
                obj.setID(str);
                String data1;
                String data
                    = "เลขประจำตัวผู้สมัคร : "
                    + tid.getText() + "\n"
                    + "ชื่อ-นามสกุล : "
                    + tname.getText() + "\n"
                    + "ที่อยู่ :"
                    + taddr.getText() + "\n"
                    + "จังหวัด :"
                    + tprovince.getText() + "\n";
                if (male.isSelected())
                    data1 = "เพศ : ชาย"
                            + "\n";
                else
                    data1 = "เพศ : หญิง"
                            + "\n";
                        
                String data2
                    =  "วุฒิการศึกษาสูงสุด :"
                    + teducate.getText() + "\n"
                    + "วิชาเอก :"
                    + tmaj.getText() + "\n"
                    + "ความรู้ความสามารถ1 : "
                    + (String)comboBox1.getSelectedItem().toString() + "\n"
                    + "ความรู้ความสามารถ2 : "
                    + (String)comboBox2.getSelectedItem().toString() + "\n"
                    + "ความรู้ความสามารถ3 : "
                    + (String)comboBox3.getSelectedItem().toString() + "\n"
                    + "ความรู้ความสามารถ4 : "
                    + (String)comboBox4.getSelectedItem().toString() + "\n"
                    + "ความรู้ความสามารถ5 : "
                    + (String)comboBox5.getSelectedItem().toString() + "\n"
                    + "ตำแหน่งที่ต้องการสมัคร1 : "
                    + (String)combo1.getSelectedItem().toString() + "\n"
                    + "ตำแหน่งที่ต้องการสมัคร2 : "
                    + (String)combo2.getSelectedItem().toString() + "\n"
                    + "ตำแหน่งที่ต้องการสมัคร3 : "
                    + (String)combo3.getSelectedItem().toString() + "\n"
                    + "\n";
                tout.setText(data + data1 + data2 );
                tout.setEditable(false);
                res.setText("Registration Successfully..");
                MyFrame2 frame2 = new MyFrame2();
                frame2.setVisible(true);
                setVisible(false);
        }
        else if (e.getSource() == reset) {
            String def = "";
            res.setText("Registration Unsuccessfully..");
        }
    }
}