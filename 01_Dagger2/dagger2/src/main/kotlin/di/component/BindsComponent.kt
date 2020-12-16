package di.component

import dagger.BindsInstance
import dagger.Component
import model.Bind

@Component
interface BindsComponent {
    fun inject(bind: Bind)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setString(string: String): Builder

        fun build(): BindsComponent
    }
}