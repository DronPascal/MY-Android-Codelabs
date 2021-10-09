package com.example.android.codelabs.paging.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by dronpascal on 09.10.2021.
 */
@Entity(tableName = "remote_keys")
data class RemoteKeys(
    @PrimaryKey val repoId: Long,
    val prevKey: Int?,
    val nextKey: Int?
)