package com.example.eventhanletest;

import android.view.View;

/*
public class ListenerImplement {

}
*/

public class ListenerImplement implements View.OnClickListener {

    private ListenerActivity calledActivity;

    public ListenerImplement(ListenerActivity previousActivity) {
        this.calledActivity = previousActivity;
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        this.calledActivity.setTheText("Into the ListenerImpementation Class!");
    }

}