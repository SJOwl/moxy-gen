package ${packageName}

import javax.inject.Inject

/**
 * Created by ${author} on ${date}
 */
class ${name}Repository @Inject constructor(
        private val remoteRepository: ${name}RepositoryRemote,
        private val localRepository: ${name}RepositoryLocal
) {

}
