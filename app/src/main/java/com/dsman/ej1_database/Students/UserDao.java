package com.dsman.ej1_database.Students;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface UserDao {
   @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserEntity users);


    @Query("DELETE FROM Users_table")
   void deleteAll(UserEntity users);

   @Query("SELECT * from Users_table ORDER BY names ASC")
   LiveData<List<UserEntity>> getAllUsers();



}
