package np.com.devish.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive,
            btnSix, btnSeven, btnEight, btnNine, btnSum, btnSub, btnMul,
            btnDiv, btnReset, btnEquals;

    TextView tvResult;
    float firstNum, secondNum, result;
    boolean boolSum = false, boolSub = false, boolMul =false, boolDiv =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding

        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnReset = findViewById(R.id.btnReset);
        btnEquals = findViewById(R.id.btnEquals);
        tvResult = findViewById(R.id.result);

        // For Displaying 0 in text view of the calculator
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"0");
            }
        });

        // For Displaying 1 in text view of the calculator
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"9");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(null);
            }
        });

        // Taking first number and storing in first variable.

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(tvResult.getText().toString());
                boolSum = true;
                tvResult.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(tvResult.getText().toString());
                boolSub = true;
                tvResult.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(tvResult.getText().toString());
                boolMul = true;
                tvResult.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(tvResult.getText().toString());
                boolDiv = true;
                tvResult.setText(null);
            }
        });

        // Taking Second number and Storing into variable after pressing Equals to sign

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNum = Float.parseFloat(tvResult.getText().toString());
                if(boolSum == true){
                    result = firstNum + secondNum;
                    tvResult.setText(result + "");
                    boolSum = false;
                } else
                if(boolSub == true){
                    result = firstNum - secondNum;
                    tvResult.setText(result + "");
                    boolSub = false;
                }else
                if(boolMul == true){
                    result = firstNum * secondNum;
                    tvResult.setText(result + "");
                    boolMul = false;
                }else
                if(boolDiv == true){
                    result = firstNum / secondNum;
                    tvResult.setText(result + "");
                    boolDiv = false;
                }
            }
        });

    }
}
