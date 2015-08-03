package com.path.android.jobqueue.examples.twitter;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.path.android.jobqueue.examples.twitter.entities.Tweet;

/**
 * Created by djzhang on 8/3/15.
 */
class ViewHolder {
    TextView statusTextView;

    public ViewHolder(View view) {
        statusTextView = (TextView) view.findViewById(R.id.status);
        view.setTag(this);
    }

    public static ViewHolder getFromView(View view) {
        Object tag = view.getTag();
        if (tag instanceof ViewHolder) {
            return (ViewHolder) tag;
        } else {
            return new ViewHolder(view);
        }
    }

    public void render(Tweet tweet) {
        statusTextView.setText(tweet.getText());
        if (tweet.getServerId() == null) {
            statusTextView.setTextColor(Color.YELLOW);
        } else {
            statusTextView.setTextColor(Color.WHITE);
        }
    }
}
