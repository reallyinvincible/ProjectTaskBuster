package app.sparsh.taskbuster.business.data.cache.implementation

import app.sparsh.taskbuster.business.data.cache.abstraction.NoteCacheDataSource
import app.sparsh.taskbuster.business.domain.model.Note
import app.sparsh.taskbuster.framework.datasource.cache.abstraction.NoteDaoService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteCacheDataSourceImpl
@Inject
constructor(
    private val noteDaoService: NoteDaoService
) : NoteCacheDataSource {

    override suspend fun insertNote(note: Note): Long = noteDaoService.insertNote(note)

    override suspend fun deleteNote(primaryKey: String): Int = noteDaoService.deleteNote(primaryKey)

    override suspend fun deleteNotes(notes: List<Note>): Int = noteDaoService.deleteNotes(notes)

    override suspend fun updateNote(
        primaryKey: String,
        newTitle: String,
        newBody: String?,
        timestamp: String?
    ): Int = noteDaoService.updateNote(primaryKey, newTitle, newBody, timestamp)

    override suspend fun searchNotes(query: String, filterAndOrder: String, page: Int): List<Note> {
        TODO("Check and write query")
    }

    override suspend fun searchNoteById(primaryKey: String): Note? =
        noteDaoService.searchNoteById(primaryKey)

    override suspend fun getNumNotes(): Int = noteDaoService.getNumNotes()

    override suspend fun insertNotes(notes: List<Note>): LongArray = noteDaoService.insertNotes(notes)

    override suspend fun getAllNotes(): List<Note> = noteDaoService.getAllNotes()

}