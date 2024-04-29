package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Username;      //用户名
    private EditText Password;      //密码
    private Button Sign_in;         //登录
    private Button Sign_up;         //注册

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件，
        //如果想获得布局文件上的控件，必须要在加载布局文件后，才能够获得，否则是null
        myInit();//控件的初始化
        //添加事件（事件编程，当一个控件发送变化时，执行的代码）
        addEvent();
    }

    // 自己定义的事件
    private void addEvent() {
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示一个弹出框
                //MainActivity.this, 在哪一个activity上弹出
                // "匿名内部类的写法", 弹出的内容
                // Toast.LENGTH_SHORT (短)  显示的时间 Toast.LENGTH_LONG（长）
                String username = Username.getText().toString();// 获得文本框中的内容
                Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();//显示
                String password = Password.getText().toString();// 获得文本框中的内容
                Toast.makeText(MainActivity.this, password, Toast.LENGTH_LONG).show();//显示
            }
        });
        Sign_in.setOnClickListener(new MyClick());
    }
    //内部类
    class MyClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        }
    }

    // 初始化控件
    private void myInit() {
        //findViewById() 通过Id获得控件
        Sign_in = findViewById(R.id.Sign_in);
        Sign_up = findViewById(R.id.Sign_up);
        Password = findViewById(R.id.Password);
        Username = findViewById(R.id.Username);

    }
}