package com.teamgmail.messenger.air.airmessenger;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ayush on 02-Nov-17.
 */

public class MessageListAdapter  extends RecyclerView.Adapter<MessageListView> {
    @Override
    public MessageListView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =inflater.inflate(R.layout.message_recycler_view,parent,false);

        return new MessageListView(view);
    }

    @Override
    public void onBindViewHolder(MessageListView holder, int position) {

    }

    @Override
    public int getItemCount() {
        //haves the total number of message sent by admin

        return 0;
    }
}
