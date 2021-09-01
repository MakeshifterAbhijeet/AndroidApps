package com.example.calculator;

//import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button one, two, three, four, five, six, seven,eight, nine, zero, dot, equals, ac, back, module, divide, multiply, minus, plus;
    TextView input, resultOutput, history;
    String data;
    boolean operator = true;
    boolean newOperator = true;
    boolean dotBol = true;
    boolean dotBol2 = true;
    boolean negValue = false;
    int counterLimit = 2;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        dot = findViewById(R.id.dot);
        equals = findViewById(R.id.result);
        ac = findViewById(R.id.refresh);
        back = findViewById(R.id.back);
        module = findViewById(R.id.modulus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multi);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        input = findViewById(R.id.writeOut);
        resultOutput = findViewById(R.id.resultPrint);
        history = findViewById(R.id.history);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = "0";
                newOperator = true;
                operator = true;
                counter = 0;
                negValue = false;
                input.setText(data);
                resultOutput.setText("0.00");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+0);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                data = input.getText().toString();
                input.setText(data+9);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                }
                if(counter < counterLimit) {
                    data = input.getText().toString();
                    Log.d("info","message is "+data.substring(data.length()-1,data.length()));
                    if(data.substring(data.length()-1,data.length()) .equals(".")) {
                        Log.d("info","Dot operation Skipped, as there is already a dot in last");
                    }
                    else {
                        input.setText(data+".");
                        counter++;
                    }
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","PLUS Operator Clicked");
                if(operator) {
                    data = input.getText().toString();
                    input.setText(data + "+");
                    operator = false;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","MINUS Operator Clicked");
                if(newOperator) {
                    data = "";
                    input.setText(data);
                    newOperator = false;
                    data = input.getText().toString();
                    input.setText(data + "-");
                }
                else if(operator) {
                    data = input.getText().toString();
                    input.setText(data + "-");
                    operator = false;
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","MULTIPLY Operator Clicked");
                if(operator) {
                    data = input.getText().toString();
                    input.setText(data+"×");
                    operator = false;
                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","DIVIDE Operator Clicked");
                if(operator) {
                    data = input.getText().toString();
                    input.setText(data+"÷");
                    operator = false;
                }

            }
        });

        module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","MODULUS Operator Clicked");
                if(operator) {
                    data = input.getText().toString();
                    input.setText(data+"%");
                    operator = false;
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","BACK Clicked....!!");
                String tempo = input.getText().toString();
                if(tempo.isEmpty()) {
                    Log.d("info","Back button skipped, as the string is already empty...!!");
                }
                else {

                    Log.d("info","Removed character is "+tempo.substring(tempo.length()-1));
                    if(tempo.substring(tempo.length()-1).equals("+") || tempo.substring(tempo.length()-1).equals("-") || tempo.substring(tempo.length()-1).equals("×") || tempo.substring(tempo.length()-1).equals("÷") || tempo.substring(tempo.length()-1).equals("%") )  {
                        operator = true;
                    }
                    tempo = tempo.substring(0,tempo.length()-1);
                    input.setText(tempo);
                }


            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("info","equals clicked");
                String cal = input.getText().toString();
                Log.d("info","input cal value is:-    "+cal);
                if(cal.substring(0,1).equals("-")) {
                    // First value is negative,
                    negValue = true;
                    cal = cal.substring(1,cal.length());
                    Log.d("info","1st string negative found, string after 1st neg removal:- " +cal);
                }

                if(cal.split("\\+").length == 2) {
                    String[] numbs = cal.split("\\+");
                    double pnt1 = Double.parseDouble(numbs[0]);
                    double pnt2 = Double.parseDouble(numbs[1]);
                    if(negValue) {
                        pnt1 = -pnt1;
                    }
                    double num = pnt1 +pnt2;
                    String temp = String.valueOf(num);
                    resultOutput.setText(temp);
                    data = input.getText().toString();
                    history.setText(data);
                    operator = true;
                    counter = 0;
                    input.setText(temp);
                }
                else if(cal.split("\\-").length == 2) {
                    String[] numbs = cal.split("\\-");
                    float pnt1 = Float.parseFloat(numbs[0]);
                    float pnt2 = Float.parseFloat(numbs[1]);
                    if(negValue) {
                        pnt1 = -pnt1;
                    }
                    float num = pnt1 - pnt2;
                    String temp = String.valueOf(num);
                    resultOutput.setText(temp);
                    data = input.getText().toString();
                    history.setText(data);
                    operator = true;
                    counter = 0;
                    input.setText(temp);
                }
                else if(cal.split("\\×").length == 2) {
                    String[] numbs = cal.split("\\×");
                    double pnt1 = Double.parseDouble(numbs[0]);
                    double pnt2 = Double.parseDouble(numbs[1]);
                    if(negValue) {
                        pnt1 = -pnt1;
                    }
                    double num = pnt1 * pnt2;
                    String temp = String.valueOf(num);
                    resultOutput.setText(temp);
                    data = input.getText().toString();
                    history.setText(data);
                    operator = true;
                    counter = 0;
                    input.setText(temp);
                }
                else if(cal.split("\\÷").length == 2) {
                    String[] numbs = cal.split("\\÷");
                    double pnt1 = Double.parseDouble(numbs[0]);
                    double pnt2 = Double.parseDouble(numbs[1]);
                    if(negValue) {
                        pnt1 = -pnt1;
                    }
                    double num = pnt1 / pnt2;
                    String temp = String.valueOf(num);
                    resultOutput.setText(temp);
                    data = input.getText().toString();
                    history.setText(data);
                    operator = true;
                    counter = 0;
                    input.setText(temp);
                }
                else if(cal.split("%").length == 2) {
                    String[] numbs = cal.split("\\%");
                    double pnt1 = Double.parseDouble(numbs[0]);
                    double pnt2 = Double.parseDouble(numbs[1]);
                    double num = pnt1 * pnt2;
                    if(negValue) {
                        pnt1 = -pnt1;
                    }
                    num = num / 100;
                    String temp = String.valueOf(num);
                    resultOutput.setText(temp);
                    data = input.getText().toString();
                    history.setText(data);
                    operator = true;
                    counter = 0;
                    input.setText(temp);
                }
                else {
                    Toast.makeText(MainActivity.this,"Error occured in Arithmetic Operation",Toast.LENGTH_SHORT).show();
                }
                negValue = false;
            }
        });
    }
}

/// use string builder