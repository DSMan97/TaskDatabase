package com.dsman.ej1_database.Students;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.dsman.ej1_database.UserRoomDatabase;

import java.util.List;

public class UserRepository {

    private UserDao mUserDao;
    private LiveData<List<UserEntity>> mAllUsers;

    public UserRepository(Application application) {
            UserRoomDatabase db = UserRoomDatabase.getDatabase(application);
        mUserDao = db.userDao();
        mAllUsers = mUserDao.getAllUsers();

    }

    LiveData<List<UserEntity>> getAllUsers() {
        return mAllUsers;
    }

    public void insert (UserEntity user) {
        new insertAsyncTask(mUserDao).execute(user);
    }

    private static class insertAsyncTask extends AsyncTask<UserEntity, Void, Void> {

        private UserDao mAsyncTaskDao;

        insertAsyncTask(UserDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final UserEntity... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
