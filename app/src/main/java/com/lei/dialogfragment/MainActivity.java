package com.lei.dialogfragment;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 演示DialogFragment的使用
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //点击按钮弹出对话框
    public void doClick(View view) {
        //new AlertDialog.Builder(this).setTitle("").setMessage("").setIcon();
        MyDialogFragment fragment = new MyDialogFragment();
        fragment.show(getFragmentManager(),"dialog");
    }

}
