package com.sergebakharev.orangesite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sergebakharev.orangesite.util.FontHelper;

public class BaseListActivity extends AppCompatActivity {

    private TextView mLoadingView;

    protected TextView getEmptyTextView(ViewGroup parent) {
        if(mLoadingView == null) {
            View root = getLayoutInflater().
                    inflate(R.layout.panel_loading, parent, true);
            mLoadingView = (TextView) root.findViewById(android.R.id.empty);
            mLoadingView.setVisibility(View.GONE);
            mLoadingView.setTypeface(FontHelper.getComfortaa(this, true));
        }
        return mLoadingView;
    }
}
