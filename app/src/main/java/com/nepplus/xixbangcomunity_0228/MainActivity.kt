package com.nepplus.xixbangcomunity_0228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.xixbangcomunity_0228.datas.Room
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(Room(7500, "서울시 동대문구", 2, "동대문구 2층 방입니다."))
        mRooms.add(Room(18500, "서울시 동대문구", 5, "동대문구 2층 방입니다."))
        mRooms.add(Room(20000, "서울시 동대문구", 4, "동대문구 2층 방입니다."))
        mRooms.add(Room(30000, "서울시 동대문구", 1, "동대문구 2층 방입니다."))
        mRooms.add(Room(40000, "서울시 서대문구", 6, "서대문구 2층 방입니다."))
        mRooms.add(Room(55000, "서울시 서대문구", 3, "서대문구 2층 방입니다."))
        mRooms.add(Room(60000, "서울시 서대문구", 3, "서대문구 2층 방입니다."))
        mRooms.add(Room(80000, "서울시 서대문구", 1, "서대문구 2층 방입니다."))
        mRooms.add(Room(90000, "서울시 중구", 8, "동대문구 2층 방입니다."))
        mRooms.add(Room(4000, "서울시 중구", 9, "동대문구 2층 방입니다."))
        mRooms.add(Room(4000, "서울시 중구", 15, "동대문구 2층 방입니다."))
        mRooms.add(Room(4000, "서울시 중구", 1, "동대문구 2층 방입니다."))

    }
}