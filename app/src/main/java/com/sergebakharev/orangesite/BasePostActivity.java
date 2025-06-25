package com.sergebakharev.orangesite;

import android.app.Activity;

import com.sergebakharev.orangesite.task.ITaskFinishedHandler;

public abstract class BasePostActivity extends Activity implements ITaskFinishedHandler<Boolean> {

    @Override
    public void onTaskFinished(int taskCode, com.sergebakharev.orangesite.task.ITaskFinishedHandler.TaskResultCode code,
        Boolean result, Object tag) {
        // TODO Auto-generated method stub
        
    }

}
