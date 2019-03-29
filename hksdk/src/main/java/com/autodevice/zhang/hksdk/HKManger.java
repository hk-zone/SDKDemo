package com.autodevice.zhang.hksdk;

import com.autodevice.zhang.hksdk.callback.LoginCallback;

public  class HKManger {
    private static HKManger instance;
    private HkMangerImpl sdk;
    private HKManger(){
        sdk = new HkMangerImpl();
    }
    public static HKManger getInstance(){
        synchronized (HKManger.class){
            if (instance==null)
                instance = new HKManger();
        }
        return instance;
    }

    public void init(){

    }
    public boolean isLogin(){
        return sdk.isLogin();
    }
    public void login(String name,String pw){
        sdk.login(name,pw);
    }
    public void setLoginCallback(LoginCallback loginCallback) {
        sdk.setLoginCallback(loginCallback);
    }
}
