package com.indianic.loginmodule.Login;

interface ILoginView {
    void showProgress();
    void hideProgress();

    void getUserInfo(UserModel mUserModel);
}
