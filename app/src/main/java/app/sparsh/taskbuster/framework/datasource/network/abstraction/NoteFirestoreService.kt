package app.sparsh.taskbuster.framework.datasource.network.abstraction

import app.sparsh.taskbuster.business.domain.model.Note

interface NoteFirestoreService {

    suspend fun insertOrUpdateNote(note: Note)

    suspend fun deleteNote(primaryKey: String)

    suspend fun insertDeletedNote(note: Note)

    suspend fun insertDeletedNotes(notes: List<Note>)

    suspend fun deleteDeletedNote(note: Note)

    suspend fun getDeletedNotes(): List<Note>

    suspend fun searchNote(note: Note): Note?

    suspend fun getAllNotes(): List<Note>

    suspend fun insertOrUpdateNotes(notes: List<Note>)

    suspend fun deleteAllNotes()

}