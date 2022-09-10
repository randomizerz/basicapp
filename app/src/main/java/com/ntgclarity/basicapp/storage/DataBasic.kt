package com.ntgclarity.basicapp.storage

import androidx.room.*

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int = 0,
    val name: String?,
    val email: String?
)

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getUsers(): List<User>

    @Insert
    fun insert(user: User)
}

@Database(entities = [User::class], version = 1)
abstract class DataBasic : RoomDatabase() {
    abstract fun getUserDao(): UserDao
}