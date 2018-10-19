package ${packageName}

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.fulldive.evry.R
import com.fulldive.evry.presentation.base.BaseMoxyFragment
import io.michaelrocks.lightsaber.getInstance

/**
 * Created by ${author} on ${date}
 */
class ${name}Fragment : BaseMoxyFragment(), ${name}View {
    override val contentResId: Int
        get() = R.layout.${layoutId}

    @InjectPresenter
    lateinit var presenter: ${name}Presenter

    @ProvidePresenter
    fun providePresenter(): ${name}Presenter = appInjector.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        appInjector.injectMembers(this)

        /** todo set listeners on all views **/
        // myView.setOnClickListener {}
    }

    override fun onResume() {
        super.onResume()
        presenter.updateView()
    }

    companion object {
        fun newInstance() = ${name}Fragment()
    }
}
