package seckit.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import seckit.Component;
import seckit.demo.mqtt.utils.MqttPublisher;

public class TabbedGUI extends Component {

    public ArrayList<ViewpointGUI> vguis;
    public JFrame frame = null;
    public JTabbedPane tabbedPane;

    public TabbedGUI() {
        frame = new JFrame("SecKit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 12));
        // tabbedPane.setTabPlacement(JTabbedPane.LEFT);
        // ImageIcon icon = null;
        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vguis = new ArrayList<ViewpointGUI>();
        
        
        final JTextField field;
        JButton btn;
        JPanel panel = new JPanel();
        btn = new JButton("Publish");
        field = new JTextField("Message to publish                         ");
        panel.setLayout(new FlowLayout());
        panel.add(field);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MqttPublisher publisher = new MqttPublisher("Publisher-ID", "iCore/*/CO2/Cozir-CO2/CO2/*/10:11:00:cc:25:70");
                publisher.publish(field.getText(), true);
                publisher.disconnect();
            }
        });
        // frame.getContentPane().add(panel, BorderLayout.NORTH);
        
        
        
    }

    public JTabbedPane createTabbedPane(ViewpointGUI vgui, String title, JPanel panel) {
        vguis.add(vgui);
        tabbedPane.add(title, panel);
        JTabbedPane t = new JTabbedPane();
        t.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel.setLayout(new BorderLayout());
        panel.add(t, BorderLayout.CENTER);
        return t;
    }

    public void show() {
        for (ViewpointGUI mgui : vguis) {
            mgui.show();
        }
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
