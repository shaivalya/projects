import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quote {

    public static final String[] quotes = {
        "The only way to do great work is to love what you do. - Steve Jobs", 
        "Life is what happens when you're busy making other plans. - John Lennon",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "The best way to predict the future is to create it. - Peter Drucker",
        "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
        "Believe you can and you're halfway there. - Theodore Roosevelt",
        "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
        "Life is really simple, but we insist on making it complicated. - Confucius",
        "Strive not to be a success, but rather to be of value. - Albert Einstein",
        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt"
    };

    public static void main(String args[]) {
        JFrame frame = new JFrame("Random Quote Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JLabel quoteLabel = new JLabel("Click the button to generate a random quote");
        quoteLabel.setForeground(Color.BLUE);

        JButton generateBtn = new JButton("Generate Quote");
        generateBtn.setBackground(Color.GREEN);
        generateBtn.setForeground(Color.WHITE);

        generateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomIndex = (int) (Math.random() * quotes.length);
                String randomQuote = quotes[randomIndex];
                quoteLabel.setText(randomQuote);
            }
        });

        panel.setLayout(new BorderLayout());
        panel.add(quoteLabel, BorderLayout.CENTER);
        panel.add(generateBtn, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}

