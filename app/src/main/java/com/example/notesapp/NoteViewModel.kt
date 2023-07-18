package com.example.notesapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewModel(application : Application) : AndroidViewModel(application) {

    val allNotes : LiveData<List<Note>>

    init {
        val dao = NoteDatabase.getDatabase(application).getNoteDao()
        val repositary = NoteRepositary(dao)
        allNotes = repositary.allNote
    }

}