package org.mvnsearch.intellij.justfile

/**
 * Justfile type
 *
 * @author linux_china
 */

import com.intellij.openapi.fileTypes.*
import com.intellij.openapi.util.IconLoader

val JustfileIcon = IconLoader.getIcon("/org/mvnsearch/intellij/justfile/justfile.png")

object JustfileFileType : LanguageFileType(JustfileLanguage) {
    override fun getIcon() = JustfileIcon
    override fun getName() = "Justfile"
    override fun getDescription() = "Just command runner"
    override fun getDefaultExtension() = "just"
}

object JustfileFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(
            JustfileFileType,
            ExactFileNameMatcher("Justfile"),
            ExactFileNameMatcher("justfile"),
            ExtensionFileNameMatcher("just")
        )
    }
}
