package com.simon.jia.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        //获取布局文件中的LInearLayout容器
//        LinearLayout root = (LinearLayout) findViewById(R.id.root);
//        //创建DrawView组件
//        final DrawView draw = new DrawView(this);
//        //设置自定义组件的最大宽度、高度
//        draw.setMinimumWidth(300);
//        draw.setMinimumHeight(500);
//        root.addView(draw);
    }
}
