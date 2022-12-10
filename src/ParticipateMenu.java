import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParticipateMenu extends JFrame{
    private JPanel JpanelParticipanteMenu;
    private JTextField textFieldNomeParticipante;
    private JButton buttonParticipanteEnviar;

    public ParticipateMenu(){
        // Cria uma instância da tela inicial.
        this.setContentPane(this.JpanelParticipanteMenu);
        this.setTitle("Cadastrar ");
        this.setSize(720,480);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
//        initialMenu.dispose();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonParticipanteEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuartasMenu quartasMenu = new QuartasMenu();
                dispose();
            }
        });
    }
}
