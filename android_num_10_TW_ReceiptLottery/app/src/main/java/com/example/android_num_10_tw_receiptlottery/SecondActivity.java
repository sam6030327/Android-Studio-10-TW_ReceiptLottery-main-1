package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b_page();
    }

    public void back(View v){
        finish();
    }
    private void b_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            String mouth = bundle.getString("mouth");
            num = Integer.parseInt(bundle.getString("numberMouth"));
            TextView text = (TextView)findViewById(R.id.month);
            text.setText(mouth);

            if (num == 1){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("123" + "\n" + "456" + "\n" + "782" + "\n" + "993" + "\n" + "999");
            }
            else if (num == 2){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("632" + "\n" + "969" + "\n" + "474" + "\n" + "388" + "\n" + "497");
            }
            else if (num == 3){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("522" + "\n" + "866" + "\n" + "869" + "\n" + "186" + "\n" + "694");
            }
            else if (num == 4){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("898" + "\n" + "899" + "\n" + "556" + "\n" + "485" + "\n" + "545");
            }
            else if (num == 5){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("050" + "\n" + "060" + "\n" + "070" + "\n" + "180" + "\n" + "190");
            }
            else if (num == 6){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("106" + "\n" + "107" + "\n" + "108" + "\n" + "109" + "\n" + "110");
            }
        }
    }
    public void click_BtoC(View v){
        EditText editText = (EditText)findViewById(R.id.editV1);
        Intent intent = new Intent(this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("winNum", editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}