package com.teamgmail.messenger.air.airmessenger;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ayush on 01-Nov-17.
 */

public class MemberListView extends RecyclerView.ViewHolder {
    public TextView members;
    public MemberListView(View view) {
        super(view);
       members=(TextView)itemView.findViewById(R.id.member);
    }

}
