package AdvancedExercises;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator implements ActionListener {

    String currentEntry = "";
    ArrayList<Integer> numbers;
    ArrayList<Character> operators;
    Label label;

    int prevNum;

    public Calculator(){
        numbers = new ArrayList<Integer>();
        operators = new ArrayList<Character>();
        prevNum = -1;

        JFrame f = new JFrame("Calculator 3000");
        JPanel mainPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        mainPanel.setLayout(boxLayout);



        this.label = new Label(currentEntry);
        label.setBounds(0, 0, 300, 40);
        mainPanel.add(label);

        JPanel gridPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 3);
        gridPanel.setLayout(gridLayout);

        ArrayList<JButton> buttons = new ArrayList<JButton>();
        buttons.add(new JButton("1"));
        buttons.add(new JButton("2"));
        buttons.add(new JButton("3"));
        buttons.add(new JButton("4"));
        buttons.add(new JButton("5"));
        buttons.add(new JButton("6"));
        buttons.add(new JButton("7"));
        buttons.add(new JButton("8"));
        buttons.add(new JButton("9"));
        buttons.add(new JButton("+"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("="));

        for(JButton but: buttons){
            but.addActionListener(this);
            gridPanel.add(but);
        }

        mainPanel.add(gridPanel);

        f.add(mainPanel);
        f.setSize(300,300);
        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        char entry = ((JButton)actionEvent.getSource()).getText().charAt(0);

        if(entry != '='){
            if(entry == '+' || entry == '-'){
                if(currentEntry.length() > 0 && currentEntry.charAt(currentEntry.length() - 1) != '+' && currentEntry.charAt(currentEntry.length() - 1) != '-'){
                    currentEntry += entry;
                    this.label.setText(currentEntry);
                }
            }
            else{
                currentEntry += entry;
                this.label.setText(currentEntry);
            }

        }
        else{
            int results = 0;
            int leftNumber = 0;
            int lastNumber = 0;
            char lastOperator = 'n';

            for(char c: currentEntry.toCharArray()){
                if(c == '+' || c == '-'){
                    if(lastOperator == 'n')
                        lastNumber = leftNumber;

                    else if(lastOperator == '+')
                        lastNumber += leftNumber;

                    else if(lastOperator == '-')
                        lastNumber -= leftNumber;

                    leftNumber = 0;
                    lastOperator = c;

                }
                else{
                    leftNumber *= 10;
                    leftNumber += Character.getNumericValue(c);
                }

            }

            if(lastOperator == '+')
                lastNumber += leftNumber;
            else if(lastOperator == '-')
                lastNumber -= leftNumber;

            currentEntry = Integer.toString(lastNumber);
            this.label.setText(Integer.toString(lastNumber));

        }

    }
}
