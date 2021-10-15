package app.sparsh.taskbuster.di

import app.sparsh.taskbuster.business.data.cache.FakeNoteCacheDataSourceImpl
import app.sparsh.taskbuster.business.data.cache.abstraction.NoteCacheDataSource
import app.sparsh.taskbuster.business.data.network.FakeNoteNetworkDataSourceImpl
import app.sparsh.taskbuster.business.data.network.abstraction.NoteNetworkDataSource
import app.sparsh.taskbuster.business.domain.model.NoteFactory
import app.sparsh.taskbuster.business.domain.util.DateUtil
import app.sparsh.taskbuster.util.isUnitTest
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class DependencyContainer {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH)
    val dateUtil = DateUtil(dateFormat)
    lateinit var noteNetworkDataSource: NoteNetworkDataSource
    lateinit var noteCacheDataSource: NoteCacheDataSource
    lateinit var noteFactory: NoteFactory

    init {
        isUnitTest = true // for Logger.kt
    }

    fun build() {
        noteFactory = NoteFactory(dateUtil)
        noteNetworkDataSource = FakeNoteNetworkDataSourceImpl(
            notesData = HashMap(),
            deletedNotesData = HashMap(),
            dateUtil = dateUtil
        )
        noteCacheDataSource = FakeNoteCacheDataSourceImpl(
            notesData = HashMap(),
            dateUtil = dateUtil
        )
    }

}