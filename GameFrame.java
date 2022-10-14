import javax.swing.*;

public class GameFrame extends JFrame {

        GameFrame()
        {
            this.add(new GamePanel());
            this.setTitle("Snake");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            //The pack () method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes.
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);



        }
    }

