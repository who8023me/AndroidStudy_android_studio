package com.simon.jia.checkbuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.rg);
        show=(TextView)findViewById(R.id.show);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String tip = i == R.id.male?"你的性别是男人":"你的性别是女人";
                        //修改show组件中的文本
                show.setText(tip);
            }
        });
    }
}
