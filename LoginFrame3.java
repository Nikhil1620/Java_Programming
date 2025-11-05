import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    //Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLable Userlable, Passlable, Resultlable;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Userlable = new JLable("User Name");
        Userlable.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50, 150,30);

        Passlable = new JLable("Password");
        Passlable.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("Submit");
        bobj.setBounds(150,150,100,30);

        Resultlable = new JLable();
        Resultlable.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlable);
        fobj.add(Passlable);
        fobj.add(Resultlable);

        fobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent oobj)
    {
        Resultlable.setText("Button Clicked...");
    }
}

class LoginFrame3
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login", 400, 300);
    }
}