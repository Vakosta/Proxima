package ru.hse.hseditor

import androidx.compose.ui.window.application
import org.koin.core.context.startKoin
import org.koin.dsl.module
import ru.hse.hseditor.domain.filesystem.FileSystemManager
import ru.hse.hseditor.presentation.states.MainWindowState
import ru.hse.hseditor.presentation.windows.MainWindow

val fileSystemModule = module {
    single { FileSystemManager() }
}

fun main() = application {
    startKoin {
        modules(
            fileSystemModule,
        )
    }
    val state = MainWindowState()
    MainWindow(state)
}