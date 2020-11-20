package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        c_page();
    }

    public void re_month(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void re_number(View v){
        finish();
    }
    private void c_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            num = Integer.parseInt(bundle.getString("winNum"));
            TextView textView = (TextView)findViewById(R.id.money);

            if (num == 123){
                textView.setText("2000元");
            }
            else if (num == 456){
                textView.setText("1000元");
            }
            else if (num == 782){
                textView.setText("200元");
            }
            else if (num == 993){
                textView.setText("200元");
            }
            else if (num == 999){
                textView.setText("500元");
            }
            else if (num == 632){
                textView.setText("2000元");
            }
            else if (num == 969){
                textView.setText("1000元");
            }
            else if (num == 474){
                textView.setText("200元");
            }
            else if (num == 388){
                textView.setText("200元");
            }
            else if (num == 497){
                textView.setText("500元");
            }
            else if (num == 694){
                textView.setText("2000元");
            }
            else if (num == 186){
                textView.setText("1000元");
            }
            else if (num == 869){
                textView.setText("200元");
            }
            else if (num == 866){
                textView.setText("200元");
            }
            else if (num == 522){
                textView.setText("500元");
            }
            else if (num == 898){
                textView.setText("2000元");
            }
            else if (num == 899){
                textView.setText("1000元");
            }
            else if (num == 556){
                textView.setText("200元");
            }
            else if (num == 485){
                textView.setText("200元");
            }
            else if (num == 545){
                textView.setText("500元");
            }
            else if (num == 050){
                textView.setText("2000元");
            }
            else if (num == 060){
                textView.setText("1000元");
            }
            else if (num == 070){
                textView.setText("200元");
            }
            else if (num == 180){
                textView.setText("200元");
            }
            else if (num == 190){
                textView.setText("500元");
            }
            else if (num == 106){
                textView.setText("200元");
            }
            else if (num == 107){
                textView.setText("100元");
            }
            else if (num == 108){
                textView.setText("200元");
            }
            else if (num == 109){
                textView.setText("200元");
            }
            else if (num == 110){
                textView.setText("500元");
            }
            else
                textView.setText("再接再厲!");
        }
    }
}