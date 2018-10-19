package a.j.sp.main

import java.io.File

val templatesPath = "/Users/evgeniivorobei/Documents/MvpGenTemplates/"
val path = "/Users/evgeniivorobei/Downloads/MvpGen/"

val date = "18/10/2018"
val author = "vorobei"

val name = "Search"
val nameSmall = "search" // todo automate (name beginning with small letter)
val layoutId = "fragment_search"
val packageName = "com.fulldive.evry.presentation.search"

val templates = arrayOf(
        "View",
        "Fragment",
        "Presenter",
        "Interactor",
        "Repository",
        "RepositoryLocal",
        "RepositoryRemote"
)


fun main(args: Array<String>) {
    // todo get all files in templatePath
    // todo generate base xml layout for fragment with toolbar
    templates.forEach { processTemplateFile(it) }
}

fun fileName(postfix: String) = "$path${getClassName(postfix)}.kt"

fun templateFileName(name: String) = "$templatesPath$name.kt"

fun getClassName(postfix: String) = "$name$postfix"

fun processTemplate(template: String): String {
    return template.replace("\${name}", name)
            .replace("\${nameSmall}", nameSmall)
            .replace("\${layoutId}", layoutId)
            .replace("\${packageName}", packageName)
            .replace("\${author}", author)
            .replace("\${date}", date)
}

fun processTemplateFile(typeName: String) {
    File(fileName(typeName)).apply {
        parentFile.mkdirs()
        createNewFile()
        writeText(processTemplate(File(templateFileName(typeName)).readText()))
    }
}