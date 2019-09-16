package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView result;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDiv, btnMul, btnDot, btnEqual, btnClear;
    private Double var1, var2;
    private boolean add, sub, div, mul;
    private char ACTION;
    

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializedFields();


        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText().toString()+ "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                var1 = Double.parseDouble(result.getText()+ "");
                add = true;
                result.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                var1 = Double.parseDouble(result.getText()+ "");
                sub = true;
                result.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                var1 = Double.parseDouble(result.getText()+ "");
                mul = true;
                result.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                var1 = Double.parseDouble(result.getText()+ "");
                div = true;
                result.setText(null);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(result.getText()+ ".");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                var2 = Double.parseDouble(result.getText()+ " ");

                if (add == true)
                {
                    result.setText(var1+var2+"");
                    add = false;
                }

                if (sub == true)
                {
                    result.setText(var1-var2+ "");
                    sub = false;
                }

                if (div == true)
                {
                    result.setText(var1/var2+ "");
                    div = false;
                }

                if (mul == true)
                {
                    result.setText(var1*var2+ "");
                    mul = false;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                result.setText(null);
            }
        });

    }

    private void initializedFields()
    {
        btn0 = findViewById(R.id.button_zero);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);
        btnAdd = findViewById(R.id.button_add);
        btnSub = findViewById(R.id.button_sub);
        btnDiv = findViewById(R.id.button_div);
        btnMul = findViewById(R.id.button_mul);
        btnDot = findViewById(R.id.button_dot);
        btnEqual = findViewById(R.id.button_equal);
        btnClear = findViewById(R.id.button_clear);
        result = findViewById(R.id.display_text);
    }

}
