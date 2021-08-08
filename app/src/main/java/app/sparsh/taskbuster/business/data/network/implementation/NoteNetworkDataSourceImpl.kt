package app.sparsh.taskbuster.business.data.network.implementation

import app.sparsh.taskbuster.business.data.network.abstraction.NoteNetworkDataSource
import app.sparsh.taskbuster.business.domain.model.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteNetworkDataSourceImpl
@Inject
constructor(
    private val noteFirestoreService: NoteFirestoreService
) : NoteNetworkDataSource {

    override suspend fun insertOrUpdateNote(note: Note) =
        noteFirestoreService.insertOrUpdateNote(note)

    override suspend fun insertOrUpdateNote(notes: List<Note>) =
        noteFirestoreService.insertOrUpdateNote(notes)

    override suspend fun deleteNote(primaryKey: String) =
        noteFirestoreService.deleteNote(primaryKey)

    override suspend fun insertDeletedNote(note: Note) =
        noteFirestoreService.insertDeletedNote(note)

    override suspend fun insertDeletedNotes(notes: List<Note>) =
        noteFirestoreService.insertDeletedNotes(notes)

    override suspend fun deleteDeletedNote(note: Note) =
        noteFirestoreService.deleteDeletedNote(note)

    override suspend fun getDeletedNotes(): List<Note> = noteFirestoreService.getDeletedNotes()

    override suspend fun searchNote(note: Note): Note? = noteFirestoreService.searchNote(note)

    override suspend fun getAllNotes(): List<Note> = noteFirestoreService.getAllNotes()

}