package com.indong.dagger2

import com.indong.dagger2.model.Person
import dagger.Module
import dagger.Provides

@Module
class MyModule {
//    동일한 반환 타입을 갖는 메서드가 두 개 이상 존재할 수 없다.
//    @Provides
//    fun provideHelloWorld(): String {
//        return "Hello World"
//    }

    @Provides
    fun provideName(): String {
        return "Austen"
    }

    @Provides
    fun provideBirthday(): Int {
        return 1991
    }

    @Provides
    fun providePerson(name: String, birthday: Int): Person {
        return Person(name, birthday)
    }
}