package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Ldi/module/MyModule;", "", "()V", "provideBirthday", "", "provideDouble", "", "()Ljava/lang/Double;", "provideHelloWorld", "", "provideName", "providePerson", "Lmodel/Person;", "name", "birthday", "provideSomeType", "Lmodel/SomeType;", "dagger2"})
@dagger.Module
public final class MyModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "HelloWorld")
    @dagger.Provides
    public final java.lang.String provideHelloWorld() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.lang.String provideName() {
        return null;
    }
    
    @dagger.Provides
    public final int provideBirthday() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final model.Person providePerson(@org.jetbrains.annotations.NotNull
    java.lang.String name, int birthday) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @dagger.Provides
    public final java.lang.Double provideDouble() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final model.SomeType provideSomeType() {
        return null;
    }
    
    public MyModule() {
        super();
    }
}