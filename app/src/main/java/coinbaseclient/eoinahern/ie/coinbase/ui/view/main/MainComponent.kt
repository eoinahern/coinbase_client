package coinbaseclient.eoinahern.ie.coinbase.ui.view.main

import coinbaseclient.eoinahern.ie.coinbase.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MainComponent {
    fun inject(main: MainActivity)
}