package com.example.dailypascal

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.io.FileReader
import java.io.IOException

class MyModel {

    data class MyObject (
        @SerializedName("quotes") val list: ArrayList<MyObject>?,
        @SerializedName("id") val id: String,
        @SerializedName("quote") val quote: String
    )

    fun readFile (): MyObject? {
        try {
            // Convert the JSON string back to GSON object
            var gsonOb = Gson()
            // var obj = gsonOb.fromJson(FileReader("/Users/janelle/AndroidStudioProjects/DailyPascal/app/src/main/res/raw/quote_list.json"), MyObject::class.java)
            var obj = gsonOb.fromJson(FileReader("./src/main/res/raw/quote_list.json"), MyObject::class.java)
            return obj
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }
}