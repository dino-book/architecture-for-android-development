package di.component

import dagger.Component
import di.module.MyModule
import model.MyClass
import model.SomeType

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String // Provision Method. 바인드된 모듈로부터 의존성을 제공.

    fun getDouble(): Double?

    fun getSomeType(): SomeType // Provision Method. 컴포넌트에서 매개 변수를 갖지 않으면서 반환형은 모듈로부터 제공되거나 주입되는 메서드

    fun injectSomeType(someType: SomeType) // Member-Injection Method. 하나의 매개 변수를 갖는 메서드. 멤버-인젝션 메서드는 void를 반환하거나 빌더처럼 메서드 체이닝이 가능한 메서드를 만들기 위해 매개 변수 타입을 반환형으로 갖는 메서드로 선언할 수 있다.

    fun injectAndReturnSomeType(someType: SomeType)

    fun inject(myClass: MyClass)

    /**
    @Component.Builder
    interface Builder {
        fun myModule(myModule: MyModule): Builder
        @BindsInstance
        fun someType(someType: SomeType)
        fun build(): MyComponent
    }
     */

    /**
    @Component.Factory
    interface Factory {
        fun newMyComponent(
            myModule: MyModule,
            @BindsInstance someType: SomeType
        ): MyComponent
    }
     */
}