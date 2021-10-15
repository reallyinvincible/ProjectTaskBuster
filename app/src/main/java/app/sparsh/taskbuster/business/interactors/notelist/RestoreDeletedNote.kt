package app.sparsh.taskbuster.business.interactors.notelist

import app.sparsh.taskbuster.business.data.cache.abstraction.NoteCacheDataSource
import app.sparsh.taskbuster.business.data.network.abstraction.NoteNetworkDataSource
import app.sparsh.taskbuster.business.domain.model.Note
import app.sparsh.taskbuster.business.domain.model.NoteFactory
import app.sparsh.taskbuster.business.domain.state.*
import app.sparsh.taskbuster.framework.presentation.notelist.state.NoteListViewState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.util.*

class RestoreDeletedNote() {

}