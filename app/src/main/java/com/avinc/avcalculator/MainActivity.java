package com.avinc.avcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;


public class MainActivity extends AppCompatActivity {

    EditText outputScreen;
    Button mul, sub, add, div, resultB, mod, perc, cancel, back, sqrt, cubrt, zero, one, two, three, four, five, six, seven, eight, nine;
    double input1, input2, result = 0;
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputScreen = (EditText) findViewById(R.id.sourceOut);
        mul = (Button) findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "*";
                    setOpertion(operator);
                }
            }
        });

        sub = (Button) findViewById(R.id.minus);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "-";
                    setOpertion(operator);
                }
            }
        });

        add = (Button) findViewById(R.id.plush);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "+";
                    setOpertion(operator);
                }
            }
        });

        div = (Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "/";
                    setOpertion(operator);
                }
            }
        });

        mod = (Button) findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "Mod";
                    setOpertion(operator);
                }
            }
        });

        perc = (Button) findViewById(R.id.per);
        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "per";
                    setOpertion(operator);
                }
            }
        });

        sqrt = (Button) findViewById(R.id.squRoot);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "sqrt";
                    setOpertion(operator);
                }
            }
        });

        cubrt = (Button) findViewById(R.id.cubRoot);
        cubrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outputScreen == null){
                    outputScreen.setText("");
                }else {
                    operator = "cbrt";
                    setOpertion(operator);
                }
            }
        });

        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText("");
            }
        });


        resultB = (Button) findViewById(R.id.result);
        resultB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "=";
                setOpertion(operator);
            }
        });

        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"0");
                getInput1();

            }
        });
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"1");
                getInput1();
            }
        });
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"2");
                getInput1();

            }
        });
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"3");
                getInput1();

            }
        });

        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"4");
                getInput1();

            }
        });

        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"5");
                getInput1();

            }
        });

        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"6");
                getInput1();

            }
        });

        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"7");
                getInput1();

            }
        });

        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"8");
                getInput1();
            }
        });

        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputScreen.setText(outputScreen.getText()+"9");
                getInput1();
            }
        });

    }

    private void getInput1(){
        //System.out.println("Value1 :");
        input1 = Double.parseDouble(outputScreen.getText()+"");
        result = input1;
    }

    private void setOpertion(String x){
        operator = x;
        outputScreen.setText("");
        getOperation();
    }

    private void getOperation() {
        // TODO Auto-generated method stub
        //System.out.println("Operation :");
        if(operator.equals("=")){
            outputScreen.setText(""+result);
        }else if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("Mod")){
            String k = operator;
            computation(k);
        }else if(operator.equals("per") || operator.equals("sqrt") || operator.equals("cbrt")){
            String k = operator;
            uNiaryResult(k);
        }
    }

    private void uNiaryResult(String x) {
        // TODO Auto-generated method stub
        if(x.equals("sqrt")){
            result = Math.sqrt(result);
        }else if(x.equals("cbrt")){
            result = Math.cbrt(result);
        }else if(x.equals("per")){
            result = result / 100;
        }
    }

    private void computation(String x){
        if(x.equals("+")){
            input2 = input2 + input1;
            result = input2;
        }else if(x.equals("-")){
            input2 = input2 - input1;
            result = input2;
        }else if(x.equals("*")){
            input2 = input2 * input1;
            result = input2;
        }else if(x.equals("/")){
            input2 = input2 / input1;
            result = input2;
        }else if(x.equals("Mod")) {
            input2 = input2 % input1;
            result = input2;
        }
    }


}
