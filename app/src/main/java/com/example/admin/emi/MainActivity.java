package com.example.admin.emi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAmount, etRate, etTime;
    Button btSubmit;
    TextView tvResult;
    double result, amount, rate, time;

   // double num1, num2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmount = (EditText) findViewById(R.id.etAmount);
        etRate = (EditText) findViewById(R.id.etRate);
        etTime = (EditText) findViewById(R.id.etTime);
        btSubmit = (Button) findViewById(R.id.btSubmit);
        tvResult = (TextView) findViewById(R.id.tvResult);



        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = Double.valueOf(etAmount.getText().toString());
                rate = Double.valueOf(etRate.getText().toString());
                time = Double.valueOf(etTime.getText().toString());

               /* num1 = Math.pow((1+rate),time);
                num2 = Math.pow((1+rate),time) - 1;
                num3 = (amount*rate*num1); */


                result = ((amount * (rate/12) * Math.pow((1+(rate/12)),time))/(Math.pow((1+(rate/12)),time)-1));

                result = Math.round(result * 100);

                tvResult.setText(Double.toString(result/100));
            }
        });
    }
}
