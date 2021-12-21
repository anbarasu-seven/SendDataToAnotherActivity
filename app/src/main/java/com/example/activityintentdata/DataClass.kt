package com.example.activityintentdata

import android.os.Parcel
import android.os.Parcelable

class DataClass() : Parcelable {
    var name: String? = "Rahul"
    var age: String? = "22"

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
        age = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataClass> {
        override fun createFromParcel(parcel: Parcel): DataClass {
            return DataClass(parcel)
        }

        override fun newArray(size: Int): Array<DataClass?> {
            return arrayOfNulls(size)
        }
    }
}