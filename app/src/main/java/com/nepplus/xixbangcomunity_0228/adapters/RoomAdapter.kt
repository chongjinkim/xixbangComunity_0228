package com.nepplus.xixbangcomunity_0228.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.xixbangcomunity_0228.R
import com.nepplus.xixbangcomunity_0228.datas.Room
import java.util.ArrayList

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList){

    var inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inflater.inflate(R.layout.room_list_item,null)
        }

        val row = tempRow!!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)

        descTxt.text = data.description

        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"

        priceTxt.text = data.getFormattedPrice()

        return row
    }

}