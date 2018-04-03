package com.sp18.ssu370.baseprojectapp.network;

import android.os.AsyncTask;



public abstract class BaseAsyncTask<Params, Progress, Result>
        extends AsyncTask<Params, Progress, Result> {

    protected CallbackListener<Result> listener;

    public void setListener(CallbackListener<Result> listenerDelegate) {
        listener = listenerDelegate;
    }

    public interface CallbackListener<Result> {
        void onCallback(Result result);
    }
}
