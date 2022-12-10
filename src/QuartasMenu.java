import javax.swing.*;

public class QuartasMenu extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton enviarButton;
    private JPanel JPanelQuartas;

    public QuartasMenu() {
        this.setContentPane(this.JPanelQuartas);
        this.setTitle("Quartas Menu ");
        this.setSize(720,480);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
//        initialMenu.dispose();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
