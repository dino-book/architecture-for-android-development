package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Ldi/module/SetModule;", "", "()V", "provideHello", "", "provideSet", "", "provideWorld", "dagger2"})
@dagger.Module
public final class SetModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.multibindings.IntoSet
    @dagger.Provides
    public final java.lang.String provideHello() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.multibindings.IntoSet
    @dagger.Provides
    public final java.lang.String provideWorld() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.multibindings.ElementsIntoSet
    @dagger.Provides
    public final java.util.Set<java.lang.String> provideSet() {
        return null;
    }
    
    public SetModule() {
        super();
    }
}