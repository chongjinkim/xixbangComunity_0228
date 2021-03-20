package com.nepplus.xixbangcomunity_0228.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.xixbangcomunity_0228.datas.Room
import java.util.ArrayList

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList){
}