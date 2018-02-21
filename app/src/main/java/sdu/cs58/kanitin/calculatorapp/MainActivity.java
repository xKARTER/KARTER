package sdu.cs58.kanitin.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1EditText, num2EditText;
    Button addButton,delButton,plusButton,divideButton;
    TextView resultTextView;
    int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.edtNumber1);
        num2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        delButton = findViewById(R.id.btnmimus);
        plusButton = findViewById(R.id.btnx);
        divideButton = findViewById(R.id.btnDivide);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปรงค่า ที่รับค่าจาก Edittext เป็น int
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 + num2;


                // แสดงผลลัพธ์ การคำนวน
                resultTextView.setText(result + "");
            }
        });//END onClick
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 - num2;
                resultTextView.setText(result + "");
            }

        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });

    }//END onCreate
} //END Class

