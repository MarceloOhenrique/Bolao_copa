import br.myconnection.ConnectionMySql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialMenu extends JFrame {

    private JPanel JpanelInitialMenu;
    private JLabel JfieldTitle;
    private JButton buttonNovoBolao;
    private JButton buttonMostrarBoloes;
    private JButton buttonImportarBoloes;
    private JButton buttonExportarBoloes;


    public InitialMenu() {
        this.setContentPane(this.JpanelInitialMenu);
        this.setTitle("Bolão da Copa");
        this.setSize(720,480);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonNovoBolao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParticipateMenu participateMenu = new ParticipateMenu();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ConnectionMySql c = new ConnectionMySql();
        // Abre conexão com o banco e cria tabelas necessárias.
        c.getConnection();


        InitialMenu initialMenu = new InitialMenu();


    }
}
