package com.example.vladimir.dz2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Vladimir on 5.4.2017..
 */

public class Transfer implements Parcelable {

    private String unitFrom, unitTo;
    float data, result;

    public Transfer(String unitFrom, String unitTo, float data, float result) {
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
        this.data = data;
        this.result = result;
    }

    public String getUnitFrom() {
        return unitFrom;
    }

    public void setUnitFrom(String unitFrom) {
        this.unitFrom = unitFrom;
    }

    public String getUnitTo() {
        return unitTo;
    }

    public void setUnitTo(String unitTo) {
        this.unitTo = unitTo;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public Transfer(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        unitFrom = in.readString();
        unitTo = in.readString();
        data = in.readFloat();
        result = in.readFloat();
    }


    public static final Parcelable.Creator<Transfer> CREATOR = new Parcelable.Creator<Transfer>() {
        public Transfer createFromParcel(Parcel in) {
            return new Transfer(in);
        }

        public Transfer[] newArray(int size) {
            return new Transfer[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(unitFrom);
        dest.writeString(unitTo);
        dest.writeFloat(data);
        dest.writeFloat(result);

    }
}
