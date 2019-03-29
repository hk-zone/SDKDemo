package com.autodevice.zhang.hksdk;

import android.os.Handler;

import com.autodevice.zhang.hksdk.callback.LoginCallback;



public class HkMangerImpl   {
    private LoginCallback loginCallback;

    public boolean isLogin() {
        return true;
    }

    public void login(String name, String pw) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (loginCallback==null)
                    throw  new RuntimeException("please set logincallback first!!!");
                else
                    loginCallback.success();
            }
        },1500);
    }

    public void setLoginCallback(LoginCallback loginCallback) {
        this.loginCallback = loginCallback;
    }
}
