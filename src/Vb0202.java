import javax.swing.*;

public class Vb0202 extends JFrame
{
    public static void main(String args[])
    {
        JFrame frame = new Vb0202();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0202");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
}

class Paneel extends JPanel
{
    private JButton knop;
    private JTextField tekstvak;

    public Paneel()
    {
        knop = new JButton("Klikken");
        tekstvak = new JTextField(10);
        add(knop);
        add(tekstvak);
    }
}





