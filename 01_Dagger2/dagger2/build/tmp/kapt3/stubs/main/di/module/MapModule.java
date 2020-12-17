package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ldi/module/MapModule;", "", "()V", "provideFoStr", "", "provideFooValue", "", "dagger2"})
@dagger.Module
public final class MapModule {
    
    @dagger.multibindings.StringKey(value = "foo")
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final long provideFooValue() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.multibindings.ClassKey(value = model.MapFoo.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final java.lang.String provideFoStr() {
        return null;
    }
    
    public MapModule() {
        super();
    }
}