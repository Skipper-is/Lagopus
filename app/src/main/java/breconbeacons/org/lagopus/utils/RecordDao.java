package breconbeacons.org.lagopus.utils;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by David Caplin on 25/09/2018.
 */@Dao
public interface RecordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Record record);

     @Query("DELETE FROM record_table")
    void deleteAll();

     @Query("SELECT * FROM record_table WHERE id = :id")
    Record selectById(int id);

     @Query("SELECT * FROM record_table")
    List<Record> getAllRecords();

     @Query("DELETE FROM record_table WHERE id = :id")
    void deleteById(int id);

     @Query("SELECT count(*) FROM record_table")
    int count();

     @Delete
    void delete(Record record);

     @Update
    void update(Record record);

}
