package com.example.project1_3


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: Data)

    //    @Delete
//    suspend fun delete(data: Data)
    @Update
    fun update(data: Data)

    @Query("SELECT 1 FROM data_table WHERE email = :email")
    fun get(email: String): Int

    @Query("SELECT id FROM data_table WHERE email = :email")
    fun getId(email: String): Int

    @Query("Select * from data_table")
    fun getAllData(): List<Data>
}