package ${packageName}

import com.fulldive.evry.model.system.SchedulersProvider
import javax.inject.Inject

/**
 * Created by ${author} on ${date}
 */
class ${name}Interactor @Inject constructor(
        private val schedulers: SchedulersProvider,
        private val ${nameSmall}Repository: ${name}Repository
) {

}
