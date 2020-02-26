package com.atatar.user.fractioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private MathView mvMonitor;

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    private Button button11,button12,button13,button14,button15,button16,button17,button18,button19,button10;
    private Button button21,button22,button23,button24,button25,button26,button27,button28,button29,button20;
    private Button buttonPlus,buttonC,buttonMinus,buttonMultiplic,buttonDivision,buttonEquals;
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button11);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.button12);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.button13);
        button3.setOnClickListener(this);
        button4 = (Button)findViewById(R.id.button14);
        button4.setOnClickListener(this);
        button5 = (Button)findViewById(R.id.button15);
        button5.setOnClickListener(this);
        button6 = (Button)findViewById(R.id.button16);
        button6.setOnClickListener(this);
        button7 = (Button)findViewById(R.id.button17);
        button7.setOnClickListener(this);
        button8 = (Button)findViewById(R.id.button18);
        button8.setOnClickListener(this);
        button9 = (Button)findViewById(R.id.button19);
        button9.setOnClickListener(this);
        button0 = (Button)findViewById(R.id.button10);
        button0.setOnClickListener(this);
        button11 = (Button)findViewById(R.id.button1);
        button11.setOnClickListener(this);
        button12 = (Button)findViewById(R.id.button2);
        button12.setOnClickListener(this);
        button13 = (Button)findViewById(R.id.button3);
        button13.setOnClickListener(this);
        button14 = (Button)findViewById(R.id.button4);
        button14.setOnClickListener(this);
        button15 = (Button)findViewById(R.id.button5);
        button15.setOnClickListener(this);
        button16 = (Button)findViewById(R.id.button6);
        button16.setOnClickListener(this);
        button17 = (Button)findViewById(R.id.button7);
        button17.setOnClickListener(this);
        button18 = (Button)findViewById(R.id.button8);
        button18.setOnClickListener(this);
        button19 = (Button)findViewById(R.id.button9);
        button19.setOnClickListener(this);
        button10 = (Button)findViewById(R.id.button0);
        button10.setOnClickListener(this);
        button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(this);
        button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(this);
        button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(this);
        button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(this);
        button25 = (Button)findViewById(R.id.button25);
        button25.setOnClickListener(this);
        button26 = (Button)findViewById(R.id.button26);
        button26.setOnClickListener(this);
        button27 = (Button)findViewById(R.id.button27);
        button27.setOnClickListener(this);
        button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(this);
        button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(this);
        button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(this);

        buttonC = (Button)findViewById(R.id.btnClear);
        buttonC.setOnClickListener(this);
        buttonPlus = (Button)findViewById(R.id.btnPlus);
        buttonPlus.setOnClickListener(this);
        buttonMinus = (Button)findViewById(R.id.btnMinus);
        buttonMinus.setOnClickListener(this);
        buttonDivision = (Button)findViewById(R.id.btnDivision);
        buttonDivision.setOnClickListener(this);
        buttonMultiplic = (Button)findViewById(R.id.btnMultiplication);
        buttonMultiplic.setOnClickListener(this);
        buttonEquals = (Button)findViewById(R.id.btnEqual);
        buttonEquals.setOnClickListener(this);

       calculator = new Calculator();
        mvMonitor = (MathView) findViewById(R.id.mvMonitor);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button1:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"1");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "1");
                    }
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button2:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"2");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "2");
                    }
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button3:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"3");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "3");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button4:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"4");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "4");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button5:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"5");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "5");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button6:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"6");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "6");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button7:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {
                    calculator.setInteger1(calculator.getInteger1()+"7");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "7");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button8:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {
                    calculator.setInteger1(calculator.getInteger1()+"8");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "8");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button9:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"9");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "9");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button0:
            {
                if(calculator.getZnak().equals("") && calculator.getFract11().equals("")) {

                    calculator.setInteger1(calculator.getInteger1()+"0");
                }
                if(!calculator.getZnak().equals("") && calculator.getFract21().equals("")) {
                    calculator.setInteger2(calculator.getInteger2() + "0");
                }
                    mvMonitor.setText(calculator.getMonitorString());

            }
            break;
            case R.id.button11:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"1");
                }else
                    calculator.setFract21(calculator.getFract21()+"1");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button12:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"2");
                }else
                    calculator.setFract21(calculator.getFract21()+"2");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button13:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"3");
                }else
                    calculator.setFract21(calculator.getFract21()+"3");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button14:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"4");
                }else
                    calculator.setFract21(calculator.getFract21()+"4");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button15:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"5");
                }else
                    calculator.setFract21(calculator.getFract21()+"5");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button16:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"6");
                }else
                    calculator.setFract21(calculator.getFract21()+"6");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button17:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"7");
                }else
                    calculator.setFract21(calculator.getFract21()+"7");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button18:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"8");
                }else
                    calculator.setFract21(calculator.getFract21()+"8");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button19:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"9");
                }else
                    calculator.setFract21(calculator.getFract21()+"9");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button10:
            {
                if(calculator.getZnak().equals("")) {

                    calculator.setFract11(calculator.getFract11()+"0");
                }else
                    calculator.setFract21(calculator.getFract21()+"0");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button21:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {
                    calculator.setFract12(calculator.getFract12()+"1");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                   calculator.setFract22(calculator.getFract22()+"1");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button22:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"2");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"2");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button23:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"3");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"3");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button24:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"4");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"4");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button25:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"5");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"5");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button26:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"6");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"6");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button27:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"7");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"7");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button28:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"8");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"8");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button29:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {

                    calculator.setFract12(calculator.getFract12()+"9");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"9");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.button20:
            {
                if(calculator.getZnak().equals("") && !calculator.getFract11().equals("")) {
                    calculator.setFract12(calculator.getFract12()+"0");
                }
                if(!calculator.getZnak().equals("") && !calculator.getFract21().equals(""))
                    calculator.setFract22(calculator.getFract22()+"0");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.btnClear:
            {
                calculator.clearMonitorString();
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.btnEqual:
            {
                if(!calculator.getZnak().equals("") || !calculator.getFract22().equals("")) {
                    calculator.setRawno("=");
                    calculator.getResaltCalculate();
                    mvMonitor.setText(calculator.getMonitorString());
                }
            }
            break;
            case R.id.btnPlus:
            {
                if(!calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("+");
                else if(!calculator.getInteger1().equals("") && calculator.getFract11().equals("") && calculator.getFract12().equals(""))
                    calculator.setZnak("+");
                else if(calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("+");
                    mvMonitor.setText(calculator.getMonitorString());


            }
            break;
            case R.id.btnMinus:
            {

                if(!calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("-");
                else if(!calculator.getInteger1().equals("") && calculator.getFract11().equals("") && calculator.getFract12().equals(""))
                    calculator.setZnak("-");
                else if(calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("-");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
            case R.id.btnMultiplication:
            {

                if(!calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("*");
                else if(!calculator.getInteger1().equals("") && calculator.getFract11().equals("") && calculator.getFract12().equals(""))
                    calculator.setZnak("*");
                else if(calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak("*");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;

            case R.id.btnDivision:
            {

                if(!calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak(":");
                else if(!calculator.getInteger1().equals("") && calculator.getFract11().equals("") && calculator.getFract12().equals(""))
                    calculator.setZnak(":");
                else if(calculator.getInteger1().equals("") && !calculator.getFract11().equals("") && !calculator.getFract12().equals(""))
                    calculator.setZnak(":");
                mvMonitor.setText(calculator.getMonitorString());
            }
            break;
        }
    }
}
