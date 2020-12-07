package com.example.aplikasiabsensi

import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.gotAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
    suspend fun deleteAll() {
        wordDao.deleteAll()
    }
}