package com.dsman.ej1_database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.dsman.ej1_database.Students.*;
import com.dsman.ej1_database.Clases.*;

@Database(entities = {UserEntity.class, ClasesEntity.class}, version = 1)
public abstract  class UserRoomDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract ClasesDao clasesDao();
    private static UserRoomDatabase INSTANCE;

    public static UserRoomDatabase getDatabase(final Context context){

        if(INSTANCE == null){
            synchronized (UserRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UserRoomDatabase.class, "utad_database")
                            .build();

                }
            }

        }
        return INSTANCE;
    }

}
