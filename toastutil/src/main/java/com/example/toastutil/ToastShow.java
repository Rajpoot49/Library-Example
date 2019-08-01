package com.example.toastutil;

import android.content.Context;
import android.widget.Toast;

public class ToastShow {

    public static void ShowToast(String message, Context mContext){
        Toast.makeText(mContext , message, Toast.LENGTH_SHORT).show();
    }
}
