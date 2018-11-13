package com.dsman.ej1_database.Students;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Users_table")
public class UserEntity {


    @PrimaryKey( autoGenerate = false)
    @ColumnInfo(name = "names")
    @NonNull
    String userN;
    @ColumnInfo(name ="photos")
    Integer uPhoto;
    String uPhone;

    public UserEntity(@NonNull String userN, Integer uPhoto, String uPhone) {
        this.userN = userN;
        this.uPhoto = uPhoto;
        this.uPhone = uPhone;
    }


    public String getUserN() {
        return userN;
    }

    public void setUserN(String userN) {
        this.userN = userN;
    }

    public Integer getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(Integer uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
}
