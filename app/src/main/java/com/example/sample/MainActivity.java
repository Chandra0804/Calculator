package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import javax.script.*;

public class MainActivity extends AppCompatActivity {
    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button plus;
    public Button minus;
    public Button multiply;
    public Button divide;
    public Button modulo;
    public Button equalto;
    public Button ac;
    public Button clear;
    public Button dot;
    public Button brackets;
    private TextView editText;
    private double a;
    private double b;
    private boolean  Decimal , invalid , operation=false , operand = false;
    private boolean Brackets = false;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.button0);
        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        plus = findViewById(R.id.buttonc);
        minus = findViewById(R.id.buttonb);
        multiply = findViewById(R.id.buttona);
        equalto = findViewById(R.id.buttond);
        divide = findViewById(R.id.buttondivide);
        modulo = findViewById(R.id.buttonmodulo);
        ac = findViewById(R.id.buttonac);
        clear = findViewById(R.id.buttonclear);
        dot = findViewById(R.id.buttondot);
        brackets = findViewById(R.id.buttonbrackets);
        editText = findViewById(R.id.textView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"1");
                operation = true;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"2");
                operation = true;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"3");
                operation = true;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"4");
                operation = true;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"5");
                operation = true;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"6");
                operation = true;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"7");
                operation = true;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"8");
                operation = true;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"9");
                operation = true;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                editText.setText(editText.getText()+"0");
                operation=true;
            }
        });

        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(Brackets == false) {
                    editText.setText(editText.getText() + "(");
                    Brackets = true;
                }
                else {
                    editText.setText(editText.getText() + ")");
                    Brackets = false;
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(operation) {
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length() - 1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%")) {
                        String str = editText.getText().toString();
                        str = str.substring(0, str.length() - 1);
                        editText.setText(str);
                    }
                    editText.setText(editText.getText() + "+");
                    Decimal = false;
                    operand = true;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(operation) {
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length() - 1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%")) {
                        String str = editText.getText().toString();
                        str = str.substring(0, str.length() - 1);
                        editText.setText(str);
                    }
                    editText.setText(editText.getText() + "-");
                    Decimal = false;
                    operand = true;
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(operation) {
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length() - 1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%")) {
                        String str = editText.getText().toString();
                        str = str.substring(0, str.length() - 1);
                        editText.setText(str);
                    }
                    editText.setText(editText.getText() + "×");
                    Decimal = false;
                    operand = true;
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(operation) {
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length() - 1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%")) {
                        String str = editText.getText().toString();
                        str = str.substring(0, str.length() - 1);
                        editText.setText(str);
                    }
                    editText.setText(editText.getText() + "÷");
                    Decimal = false;
                    operand = true;
                }
            }
        });

        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                if(operation) {
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length() - 1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%")) {
                        String str = editText.getText().toString();
                        str = str.substring(0, str.length() - 1);
                        editText.setText(str);
                    }
                    editText.setText(editText.getText() + "%");
                    Decimal = false;
                    operand = true;
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                a = 0.0;
                b = 0.0;
                Brackets = false;
                Decimal = false;
                invalid = false;
            }
        });

        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (operation)
                    {
                        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                        String operation = editText.getText().toString();
                        operation = operation.replace('÷', '/');
                        operation = operation.replace('×', '*');
                        if(operation.substring(0,1).matches("0")) operation = operation.substring(1,operation.length());
                        try
                        {
                            String result = engine.eval(operation).toString();
                            String[] results = result.split(".");
                            editText.setText(result);
                        }
                        catch (ScriptException e)
                        {
                            editText.setText("Invalid Expression");
                            invalid = true;
                            Decimal = false;
                        }
                    }
                    else
                    {
                        String str = editText.getText().toString();
                        editText.setText(str);
                    }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Decimal){
                    if(invalid) editText.setText("");
                    editText.setText(editText.getText()+".");
                    Decimal = true;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(invalid) editText.setText("");
                String str = editText.getText().toString();
                if(str.length() >= 1){
                    String temp = editText.getText().toString();
                    temp = temp.substring(temp.length()-1);
                    if (temp.equals("+") || temp.equals("-") || temp.equals("÷") || temp.equals("×") || temp.equals("%") || temp.equals("(") || temp.equals("."))
                    {
                        Brackets = false;
                        Decimal = false;
                    }
                    if(temp.equals(")")) Brackets = true;
                    str = str.substring(0,str.length()-1);
                    editText.setText(str);
                }
                else if(str.length()<=1){
                    editText.setText("");
                }
            }
        });
    }
}