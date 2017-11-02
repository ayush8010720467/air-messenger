package com.teamgmail.messenger.air.airmessenger;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ayush on 02-Nov-17.
 */

public class MessageListView extends RecyclerView.ViewHolder{
    public TextView message;
    public MessageListView(View view) {
        super(view);
        message=(TextView)itemView.findViewById(R.id.messageDelivered);
    }
}
