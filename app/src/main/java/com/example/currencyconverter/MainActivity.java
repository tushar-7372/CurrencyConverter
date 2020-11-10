package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view)
    {
        Log.i("Info","Button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);
        String amountInPounds=editText.getText().toString();
        Double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        Double amountInDollar=amountInPoundsDouble*73.63;
        String  amountInDollarString=String.format("%.2f", amountInDollar);

        Toast.makeText(this, "converted amount is " + amountInDollarString, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}