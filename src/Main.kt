package a.j.sp.main

import java.io.File

val templatesPath = "/Users/evgeniivorobei/Documents/MvpGenTemplates/"
val path = "/Users/evgeniivorobei/Downloads/MvpGen/SearchResultList"

val date = "06/09/2018"
val author = "vorobei"

val name = "MyClassName"
val nameSmall = "newClassName"
val layoutId = "fragment_settings_push_notifications"
val packageName = "com.fulldive.evry.presentation.mytemplate"

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