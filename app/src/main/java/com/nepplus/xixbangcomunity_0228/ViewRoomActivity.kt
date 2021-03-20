package com.nepplus.xixbangcomunity_0228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.room_list_item.*

class ViewRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

        val roomData = intent.getSerializableExtra("roominfo") as Room

        priceTxt.text = roomData.getFormattedPrice()

        floorTxt.text = roomData.getFormattedPrice()

        addressTxt.text = roomData.getFormattedPrice()

        descTxt.text = roomData.getFormattedPrice
    }
}