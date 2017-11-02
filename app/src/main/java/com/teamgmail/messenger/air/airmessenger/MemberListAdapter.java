package com.teamgmail.messenger.air.airmessenger;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ayush on 01-Nov-17.
 */

public class MemberListAdapter extends RecyclerView.Adapter<MemberListView> {

    @Override
    public MemberListView onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =inflater.inflate(R.layout.member_recycler_view,parent,false);

        return new MemberListView(view);
    }

    @Override
    public void onBindViewHolder(MemberListView holder, int position) {

        //the data come from viewHolder is set to position and once the position 1 becomes off screen ,
        //this method call again to reuse the 1 textview on 6th element.

        //if (position % 2 == 0) {
      //  holder.itemView.setBackgroundColor(Color.YELLOW);
   // } else {
   //     holder.itemView.setBackgroundColor(Color.RED);
   // }

    }

    @Override
    public int getItemCount() {
        // must contain the total number of members
        return 0;
    }
}
