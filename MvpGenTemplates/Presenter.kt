package ${packageName}

import com.arellomobile.mvp.InjectViewState
import com.fulldive.evry.presentation.base.BaseMoxyPresenter
import com.fulldive.evry.presentation.base.ErrorHandler
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created by ${author} on ${date}
 */
@InjectViewState
class ${name}Presenter @Inject constructor(
        errorHandler: ErrorHandler,
        private val router: Router,
        private val ${nameSmall}Interactor: ${name}Interactor
) : BaseMoxyPresenter<${name}View>(errorHandler) {

    fun onBack() = router.exit()

    /**
     * Called onResume for fragment - set view state here
     */
    fun updateView() {

    }
}
