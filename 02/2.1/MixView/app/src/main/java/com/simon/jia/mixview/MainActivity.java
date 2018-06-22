package com.simon.jia.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //定义一个访问图片的数组
    int[] images = new int[]{
            R.mipmap.ajax,
            R.mipmap.classic,
            R.mipmap.ee,
            R.mipmap.java,
            R.mipmap.xml,
};
    int currentImg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //获取linearlayout 布局容器
        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        //程序闯将ImageView组件
        final ImageView image = new ImageView(this);
        //将ImageVIew组件添加到LinearLayout布局容器中
        main.addView(image);
        //初始化时显示第一张图片
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //改变ImageView李显示的图片
                image.setImageResource(images[++currentImg%images.length]);
            }
        });
    }
}
