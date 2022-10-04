import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JFrame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Main extends JFrame
{
    private Interface anInterface = new Interface();
    private ImagePanel imagePanel = new ImagePanel();

    private String request = "";

    public Main()
    {
        imagePanel.add(anInterface);

        add(imagePanel);

        actions();

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(225, 300);
        setTitle("Calculator");
        setResizable(false);
    }

    public void actions()
    {
        anInterface.calculatorButtons.zero.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 0;

                anInterface.calculatorScreen.results.setText(text + 0);
            }
        });
        anInterface.calculatorButtons.one.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 1;

                anInterface.calculatorScreen.results.setText(text + 1);
            }
        });
        anInterface.calculatorButtons.two.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 2;

                anInterface.calculatorScreen.results.setText(text + 2);
            }
        });
        anInterface.calculatorButtons.three.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 3;

                anInterface.calculatorScreen.results.setText(text + 3);
            }
        });
        anInterface.calculatorButtons.four.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 4;

                anInterface.calculatorScreen.results.setText(text + 4);
            }
        });
        anInterface.calculatorButtons.five.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 5;

                anInterface.calculatorScreen.results.setText(text + 5);
            }
        });
        anInterface.calculatorButtons.six.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 6;

                anInterface.calculatorScreen.results.setText(text + 6);
            }
        });
        anInterface.calculatorButtons.seven.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 7;

                anInterface.calculatorScreen.results.setText(text + 7);
            }
        });
        anInterface.calculatorButtons.eight.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 8;

                anInterface.calculatorScreen.results.setText(text + 8);
            }
        });
        anInterface.calculatorButtons.nine.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += 9;

                anInterface.calculatorScreen.results.setText(text + 9);
            }
        });

        anInterface.calculatorButtons.dot.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += ".";

                anInterface.calculatorScreen.results.setText(text + ".");
            }
        });

        anInterface.calculatorButtons.plus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += "+";

                anInterface.calculatorScreen.results.setText(text + "+");
            }
        });

        anInterface.calculatorButtons.divide.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += "/";

                anInterface.calculatorScreen.results.setText(text + "÷");
            }
        });

        anInterface.calculatorButtons.multiply.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += "*";

                anInterface.calculatorScreen.results.setText(text + "×");
            }
        });

        anInterface.calculatorButtons.minus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = anInterface.calculatorScreen.results.getText();

                request += "-";

                anInterface.calculatorScreen.results.setText(text + "-");
            }
        });

        anInterface.calculatorButtons.ac.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                request = "";
                anInterface.calculatorScreen.results.setText("");
            }
        });

        anInterface.clearButton.equals.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");

                    String answer = engine.eval(request).toString();

                    anInterface.calculatorScreen.results.setText("" + answer);

                    request = answer;
                }
                catch(ScriptException | NullPointerException e1)
                {
                    anInterface.calculatorScreen.results.setText("ERROR");
                }
            }
        });

    }

    public static void main(String[] args)
    {
        Main itf = new Main();
    }
}

class CalculatorButtons extends JPanel
{
    protected JButton zero;
    protected JButton one;
    protected JButton two;
    protected JButton three;
    protected JButton four;
    protected JButton five;
    protected JButton six;
    protected JButton seven;
    protected JButton eight;
    protected JButton nine;

    protected JButton dot;

    protected JButton plus;
    protected JButton divide;
    protected JButton multiply;
    protected JButton minus;
    protected JButton ac;

    public CalculatorButtons()
    {
        setOpaque(false);

        setLayout(new GridBagLayout());

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");

        dot = new JButton(".");

        plus = new JButton("+");
        divide = new JButton("÷");
        multiply = new JButton("×");
        minus = new JButton("-");
        ac = new JButton("AC");

        JLabel space = new JLabel("                                    ");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.ipadx = -20;

        gbc.gridx = 0;
        gbc.gridy = 4;

        gbc.anchor = GridBagConstraints.WEST;
        add(zero, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        add(dot, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        add(ac, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;

        gbc.anchor = GridBagConstraints.WEST;
        add(one, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        add(two, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        add(three, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        gbc.anchor = GridBagConstraints.WEST;
        add(four, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        add(five, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        add(six, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;

        gbc.anchor = GridBagConstraints.WEST;
        add(seven, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        add(eight, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        add(nine, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(plus, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(divide, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(multiply, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(minus, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(space);
    }
}

class CalculatorScreen extends JPanel
{
    protected JTextArea results;
    protected JScrollPane scrollPane;

    public CalculatorScreen()
    {
        setOpaque(false);

        results = new JTextArea(5, 16);
        results.setEditable(false);
        results.setLineWrap(true);

        scrollPane = new JScrollPane(results);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(scrollPane, gbc);
    }
}

class ClearButton extends JPanel
{
    protected JButton equals;

    public ClearButton()
    {
        setOpaque(false);

        setLayout(new GridBagLayout());

        equals = new JButton("=");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 124;
        add(equals, gbc);
    }
}

class ImagePanel extends JPanel
{
    protected Image loginImage;

    public ImagePanel()
    {
        this.loginImage =
                new ImageIcon(getClass().getResource("Pics/CalcBackground.jpg")).getImage();

        Dimension size = new Dimension(loginImage.getWidth(null), loginImage.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(new GridBagLayout());
    }

    protected void paintComponent(Graphics g) {
        g.drawImage(loginImage, 0, 0, null);
    }
}

class Interface extends JPanel
{
    protected CalculatorScreen calculatorScreen = new CalculatorScreen();
    protected CalculatorButtons calculatorButtons = new CalculatorButtons();
    protected ClearButton clearButton = new ClearButton();

    Interface()
    {
        setOpaque(false);

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(calculatorScreen, gbc);

        gbc.ipady = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(calculatorButtons, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(clearButton, gbc);
    }
}