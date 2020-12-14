package di

import dagger.Module
import dagger.Provides

// includes를 통해 다른 모듈을 상속할 수 있다.
@Module(includes = [ModuleParent::class])
class ModuleChild {
    @Provides
    fun provideB(): String {
        return "B" // 중복되는 타입이기 때문에 에러가 발생한다.
    }
}