package com.example.nishant.numbercheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare() {
            double squareRoot=Math.sqrt((double)number);
            if(squareRoot%1.0==0) {
                return true;
            }
            else {return false;}
        }
        public boolean isTriangular() {
            int triangular=1;
            int add=1;
            while(number>=triangular) {
                add++;
                if(number==triangular) {
                    return true;
                }
                triangular+=add;

            }
            return false;
        }

    }
    public void getresult(View view){
        EditText num=(EditText)findViewById(R.id.input) ;

        Number inputnum=new Number();
        inputnum.number=Integer.parseInt(num.getText().toString());

        String message;
        if(inputnum.isSquare()&&inputnum.isTriangular()){
            message="Number is Square as well as Triangular";

        }
        else if(inputnum.isSquare()){
            message="Number is Square";
        } else if (inputnum.isTriangular()) {
            message="Number is Triangular";
        }
        else{message="Number is neither Square nor Triangular";}

        Toast.makeText(this, message,Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
