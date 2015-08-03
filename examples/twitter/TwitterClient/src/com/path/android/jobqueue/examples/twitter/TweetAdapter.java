package com.path.android.jobqueue.examples.twitter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.path.android.jobqueue.examples.twitter.adapters.LazyListAdapter;
import com.path.android.jobqueue.examples.twitter.entities.Tweet;

/**
 * Created by djzhang on 8/3/15.
 */
class TweetAdapter extends LazyListAdapter<Tweet> {
    private final LayoutInflater layoutInflater;

    public TweetAdapter(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.list_tweet, viewGroup, false);
            holder = new ViewHolder(view);
        } else {
            holder = ViewHolder.getFromView(view);
        }
        holder.render(getItem(position));
        return view;
    }

}
