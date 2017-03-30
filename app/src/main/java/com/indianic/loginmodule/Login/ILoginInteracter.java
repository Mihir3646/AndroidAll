package com.indianic.loginmodule.Login;

interface ILoginInteracter {
    boolean validateData(String username, String password);

    void doLogin(String username, String password, ResultInfo infoListener);

    interface ResultInfo{
        void getUserInfo(UserModel user);
    }
}
