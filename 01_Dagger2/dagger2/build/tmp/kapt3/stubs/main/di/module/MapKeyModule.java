package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Ldi/module/MapKeyModule;", "", "()V", "provideCat", "", "provideDog", "provideFloatValue", "provideIntValue", "dagger2"})
@dagger.Module
public final class MapKeyModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @model.AnimalKey(value = model.Animal.CAT)
    @dagger.multibindings.IntoMap
    public final java.lang.String provideCat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @model.AnimalKey(value = model.Animal.DOG)
    @dagger.multibindings.IntoMap
    public final java.lang.String provideDog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @model.NumberKey(value = float.class)
    @dagger.multibindings.IntoMap
    public final java.lang.String provideFloatValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @model.NumberKey(value = int.class)
    @dagger.multibindings.IntoMap
    public final java.lang.String provideIntValue() {
        return null;
    }
    
    public MapKeyModule() {
        super();
    }
}