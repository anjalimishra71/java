import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;

public class student_adddb extends JFrame implements ActionListener
{
static Connection con;
static ResultSet rs;
static Statement stmt;
static int r;
static String n,c;
static BufferedReader br;

int roll=0;
JFrame frm;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,title;
JTextField t1,t2,t3,t4;
JButton b1,b2,b3,b4,b5;
JRadioButton r1,r2;
JCheckBox ch1,ch2,ch3;
JComboBox list;
JTextArea tr;
Font f;
JPanel p1,p2,p3,p4,p5;
ButtonGroup btg;
public student_adddb()
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anjalimm#31");
}catch(Exception e){
System.out.println("Connection Error:"+e);
}



frm=new JFrame("Student Registration");
f=new Font("Monotype Corsiva",Font.BOLD,34);

title=new JLabel("Student Registration Form");
title.setFont(f);
title.setForeground(Color.RED);

p1=new JPanel(new FlowLayout());
p2=new JPanel(new GridLayout(8,2));
p3=new JPanel(new FlowLayout());

p4=new JPanel(new FlowLayout());
p5=new JPanel(new FlowLayout());

tr=new JTextArea(5,10);

r1=new JRadioButton("Male");
r2=new JRadioButton("Female");

ch1=new JCheckBox("10th");
ch2=new JCheckBox("12th");
ch3=new JCheckBox("Grad.");

btg=new ButtonGroup();//allow single selection

btg.add(r1);btg.add(r2);


l1=new JLabel("Enter Name:");
l2=new JLabel("Enter Father:");
l3=new JLabel("Select Gender:");
l4=new JLabel("Enter Address:");
l5=new JLabel("Enter Phone:");
l6=new JLabel("Select Course:");
l7=new JLabel("Enter DOB:");
l8=new JLabel("Select Qualification:");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);


b1=new JButton("Save");
b2=new JButton("Delete");
b3=new JButton("Update");
b4=new JButton("Search");
b5=new JButton("Clear");

list=new JComboBox();
list.addItem("Plz Select");
list.addItem("Bca");
list.addItem("Mca");
list.addItem("Pgdca");

p1.add(title);

p4.add(r1);p4.add(r2);
p5.add(ch1);p5.add(ch2);p5.add(ch3);
p2.add(l1);p2.add(t1);p2.add(l2);p2.add(t2);
p2.add(l3);p2.add(p4);p2.add(l4);p2.add(tr);
p2.add(l5);p2.add(t3);p2.add(l6);p2.add(list);
p2.add(l7);p2.add(t4);p2.add(l8);p2.add(p5);
p3.add(b1);p3.add(b2);p3.add(b3);p3.add(b4);p3.add(b5);

p1.setBackground(Color.PINK);
p3.setBackground(Color.ORANGE);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.add(p1,BorderLayout.NORTH);
frm.add(p2,BorderLayout.CENTER);
frm.add(p3,BorderLayout.SOUTH);
frm.setSize(600,300);
frm.setVisible(true);
frm.setLocationRelativeTo(null);
}

public void actionPerformed(ActionEvent ev)
{
String gen="",qual="",n,f,c,a,p,d,msg="",sql="";
if(r1.isSelected())
gen="Male";
if(r2.isSelected())
gen="Female";
if(ch1.isSelected())
qual=qual+"10th ,";
if(ch2.isSelected())
qual=qual+"12 ,";
if(ch3.isSelected())
qual=qual+"Graduation";
n=t1.getText();
f=t2.getText();
p=t3.getText();
d=t4.getText();
a=tr.getText();
c=(String)list.getSelectedItem();


if(ev.getSource()==b1)
{
try{
sql="insert into student_info values(st_id.nextval,'"+n+"','"+f+"','"+gen+"','"+a+"','"+p+"','"+c+"','"+d+"','"+qual+"')";
stmt=con.createStatement();
int x=stmt.executeUpdate(sql);
if(x>0)
JOptionPane.showMessageDialog(frm,"Record Has been Saved!!","Information",JOptionPane.INFORMATION_MESSAGE);
}catch(Exception e){
System.out.println("Input Save Error:"+e);
e.printStackTrace();
}

}

if(ev.getSource()==b2)
{
roll=Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No To Delete:"));
try{
sql="delete from student_info where id="+roll;
stmt=con.createStatement();
int x=stmt.executeUpdate(sql);
if(x>0)
JOptionPane.showMessageDialog(frm,"Record Has been Deleted!!","Information",JOptionPane.INFORMATION_MESSAGE);
else
JOptionPane.showMessageDialog(frm,"Record Not Found!!","Information",JOptionPane.ERROR_MESSAGE);
}catch(Exception e){
System.out.println("Delete Error:"+e);
}
}

if(ev.getSource()==b4)
{
roll=Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No To Delete:"));
try{
sql="select * from student_info where id="+roll;
stmt=con.createStatement();
rs=stmt.executeQuery(sql);
rs.next();
t1.setText(rs.getString(2));
t2.setText(rs.getString(3));
JOptionPane.showMessageDialog(frm,"Record Has been Found:","Information",JOptionPane.INFORMATION_MESSAGE);
}catch(Exception e){
System.out.println("Input Search Error:"+e);
e.printStackTrace();
}

}



if(ev.getSource() == b3)
{
    roll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No to Update:"));
    try {
        sql = "SELECT * FROM student_info WHERE id=" + roll;
        stmt = con.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            t1.setText(rs.getString("name"));
            t2.setText(rs.getString("father"));
            tr.setText(rs.getString("address"));
            t3.setText(rs.getString("phone"));
            list.setSelectedItem(rs.getString("course"));
            t4.setText(rs.getString("dob"));

            if (rs.getString("gender").equalsIgnoreCase("Male"))
                r1.setSelected(true);
            else
                r2.setSelected(true);

            String q = rs.getString("qualification");
            ch1.setSelected(q.contains("10th"));
            ch2.setSelected(q.contains("12"));
            ch3.setSelected(q.contains("Graduation"));

            int confirm = JOptionPane.showConfirmDialog(frm, "Edit the data in form, then click OK to save changes.");
            if(confirm == JOptionPane.YES_OPTION){

                n = t1.getText();
                f = t2.getText();
                a = tr.getText();
                p = t3.getText();
                c = (String) list.getSelectedItem();
                d = t4.getText();

                gen = "";
                qual = "";
                if(r1.isSelected()) gen = "Male";
                if(r2.isSelected()) gen = "Female";
                if(ch1.isSelected()) qual += "10th ,";
                if(ch2.isSelected()) qual += "12 ,";
                if(ch3.isSelected()) qual += "Graduation";

                sql = "UPDATE student_info SET name='" + n +
                        "', father='" + f +
                        "', gender='" + gen +
                        "', address='" + a +
                        "', phone='" + p +
                        "', course='" + c +
                        "', dob='" + d +
                        "', qualification='" + qual +
                        "' WHERE id=" + roll;
                int x = stmt.executeUpdate(sql);
                if (x > 0)
                    JOptionPane.showMessageDialog(frm, "Record Updated Successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(frm, "Update Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frm, "Roll No Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        System.out.println("Update Error: " + e);
        e.printStackTrace();
    }
}




if(ev.getSource()==b5)
{
t1.setText("");
t2.setText("");
r1.setSelected(false);
r2.setSelected(false);
list.setSelectedItem("Plz Select");
t3.setText("");
t4.setText("");
tr.setText("");
ch1.setSelected(false);
ch2.setSelected(false);
ch3.setSelected(false);
}
}




public static void main(String args[])
{
new student_adddb();
}
}

