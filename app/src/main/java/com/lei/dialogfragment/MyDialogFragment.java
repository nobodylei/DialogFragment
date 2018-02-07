package com.lei.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by yanle on 2018/2/7.
 * 至少实现onCreateView()或者onCreateDialog()方法
 * onCreateView()表示以XML布局文件的形式展示dialog
 * onCreateDialog()利用alertDialog或者dialog创建
 */

public class MyDialogFragment extends DialogFragment{
    //表示当前dialog被创建时回调的方法
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("提示");//设置对话框标题
        builder.setMessage("您确定要退出吗?");//设置对话框提示信息
        builder.setIcon(R.mipmap.ic_launcher);//设置对话框图标

        //设置确定按钮点击事件
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"退出",Toast.LENGTH_SHORT).show();
            }
        });
        //设置取消按钮
        builder.setNegativeButton("取消",null);

        return builder.create();//将dialog构建的对象返回
    }
}
