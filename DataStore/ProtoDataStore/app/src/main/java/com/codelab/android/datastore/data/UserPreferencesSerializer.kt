package com.codelab.android.datastore.data

import androidx.datastore.core.CorruptionException
import androidx.datastore.core.Serializer
import com.codelab.android.datastore.UserPreferences
import com.google.protobuf.InvalidProtocolBufferException
import java.io.InputStream
import java.io.OutputStream

/**
 * Created by dronpascal on 07.10.2021.
 */
object UserPreferencesSerializer : Serializer<UserPreferences> {
    override val defaultValue: UserPreferences = UserPreferences.getDefaultInstance()
    override suspend fun readFrom(input: InputStream): UserPreferences {
        try {
            return UserPreferences.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override suspend fun writeTo(t: UserPreferences, output: OutputStream) = t.writeTo(output)
}