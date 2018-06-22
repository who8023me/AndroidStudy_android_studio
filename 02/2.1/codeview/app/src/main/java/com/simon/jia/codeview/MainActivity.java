package com.simon.jia.codeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //创建一个线性布局管理器
        LinearLayout layout = new LinearLayout(this);
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个TextView
        final TextView show = new TextView(this);
        Button bn = new Button(this);
        bn.setText(R.string.ok);
        bn.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        //向Layout容器中添加TextView
        ((ViewGroup) layout).addView(show);
        //向Layout容器中添加按钮
        ((ViewGroup) layout).addView(bn);
        bn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                show.setText("simon says:\"Hello,Android, "+new java.util.Date()+"\"");
            }
        });

    }
}
