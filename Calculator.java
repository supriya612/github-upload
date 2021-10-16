import java.awt.*;
import java.awt.event.*;
import java.awt.TextField.*;

class MarvellousWindow extends Frame implements ActionListener 
{
    TextField t1;
    TextField t2;
    TextField t3;
    Button b1,b2,b3,b4,b5;
    Label l1,l2,l3;
    public MarvellousWindow(String str,int x,int y)
    {
        super();
        setTitle(str);
        setSize(x,y);
        l1=new Label("First Number");
        l2=new Label("second number");
        l3=new Label ("Result:");
       
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);

        b1=new Button("ADD");
        b1.setBounds(50,250,50,20);
        b2=new Button("SUB");
        b2.setBounds(110,250,50,20);
        b3=new Button("MUL");
        b3.setBounds(170,250,50,20);
        b4=new Button("DIV");
        b4.setBounds(230,250,50,20);
        b5=new Button("CLEAR");
        b5.setBounds(290,250,50,20);
          
        t1=new TextField();
        t1.setBounds(200,100,100,20);
        t2=new TextField();
        t2.setBounds(200,140,100,20);
        t3=new TextField();
        t3.setBounds(200,180,100,20);
       
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        setLayout(null);
        setVisible(true);
       
        
    }
    public void actionPerformed(ActionEvent obj)
    {
        int iNo1=Integer.parseInt(t1.getText());
        int iNo2=Integer.parseInt(t2.getText());
        if(obj.getSource()==b1)
        {
            t3.setText(String.valueOf(iNo1+iNo2));
        }
        if(obj.getSource()==b2)
        {
            t3.setText(String.valueOf(iNo1-iNo2));
        }
        if(obj.getSource()==b3)
        {
            t3.setText(String.valueOf(iNo1*iNo2));
        }
        if(obj.getSource()==b4)
        {
            t3.setText(String.valueOf(iNo1/iNo2));
        }
        if(obj.getSource()==b5)
        {
           System.exit(0);
        }
            }
}

class Calculator
{
    public static void main(String arg[])
    {
        MarvellousWindow mobj=new MarvellousWindow("CALCULATOR",400,400);
       
    }
}