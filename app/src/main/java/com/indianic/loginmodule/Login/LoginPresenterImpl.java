package com.indianic.loginmodule.Login;

class LoginPresenterImpl implements ILoginPresenter {

    private ILoginView mILoginView;
    private ILoginInteracter mILoginInteracter;

    LoginPresenterImpl(ILoginView view, ILoginInteracter interactor) {
        mILoginView = view;
        mILoginInteracter = interactor;
    }

    @Override
    public void IWillCallLogin(String userName, String password) {
        mILoginView.showProgress();

        if (mILoginInteracter.validateData(userName, password)) {
            mILoginInteracter.doLogin(userName, password, new ILoginInteracter.ResultInfo() {
                @Override
                public void getUserInfo(UserModel user) {
                    mILoginView.getUserInfo(user);
                }
            });
        }
    }
}
