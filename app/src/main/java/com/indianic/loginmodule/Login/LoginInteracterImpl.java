package com.indianic.loginmodule.Login;

class LoginInteracterImpl implements ILoginInteracter {
    @Override
    public boolean validateData(String username, String password) {
        // return true if data is valid
        return false;
    }

    @Override
    public void doLogin(String username, String password, ResultInfo infoListener) {
        //Network call
        UserModel mUser = new UserModel();


        infoListener.getUserInfo(mUser);
    }
}
