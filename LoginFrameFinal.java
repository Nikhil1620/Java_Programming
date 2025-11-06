import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    //Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel Userlable, Passlable, Resultlable;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Userlable = new JLabel("User Name");
        Userlable.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50, 150,30);

        Passlable = new JLabel("Password");
        Passlable.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("Submit");
        bobj.setBounds(150,150,100,30);

        Resultlable = new JLabel();
        Resultlable.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlable);
        fobj.add(Passlable);
        fobj.add(Resultlable);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // UserName = Marvellous
    // Password = Marvellous@123

    public void actionPerformed(ActionEvent oobj)
    {
        String uName = tobj.getText();
        String Pass = pobj.getText();

        if((uName.equals("Marvellous")) && (Pass.equals("Marvellous@123")))
        {
            Resultlable.setText("Login Successfull..");
        }   
        else
        {
            Resultlable.setText("Login Failed....");
        }
    }
}

class LoginFrameFinal
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login", 400, 300);
    }
}