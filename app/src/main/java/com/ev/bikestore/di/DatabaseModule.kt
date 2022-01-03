package com.ev.bikestore.di

import android.content.Context
import androidx.room.Room
import com.ev.bikestore.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        AppDatabase::class.java,
        "bike-store-db"
    ).build()

    @Singleton
    @Provides
    fun provideBikeDao(db: AppDatabase) = db.getBikeDao()
}