package com.dsman.ej1_database.Clases;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import com.dsman.ej1_database.Clases.*;
import com.dsman.ej1_database.UserRoomDatabase;

import java.util.List;

public class ClasesRepository {
    private ClasesDao mClaseDao;
    private LiveData<List<ClasesEntity>> mAllClases;

    public ClasesRepository(Application application) {
        UserRoomDatabase db = UserRoomDatabase.getDatabase(application);
        mClaseDao = db.clasesDao();
        mAllClases = mClaseDao.getAllClases();

    }

    LiveData<List<ClasesEntity>> getAllClases() {
        return mAllClases;
    }

    public void insert (ClasesEntity clase) {
        new ClasesRepository.insertAsyncTask(mClaseDao).execute(clase);
    }

    private static class insertAsyncTask extends AsyncTask<ClasesEntity, Void, Void> {

        private ClasesDao mAsyncTaskDao;

        insertAsyncTask(ClasesDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final ClasesEntity... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
