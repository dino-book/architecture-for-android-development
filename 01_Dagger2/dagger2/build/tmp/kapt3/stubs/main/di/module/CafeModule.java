package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ldi/module/CafeModule;", "", "()V", "provideMachine", "Lmodel/Machine;", "builder", "Ldi/component/MachineComponent$Builder;", "provideWater", "Lmodel/Water;", "dagger2"})
@dagger.Module(subcomponents = {di.component.MachineComponent.class})
public final class CafeModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final model.Water provideWater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final model.Machine provideMachine(@org.jetbrains.annotations.NotNull
    di.component.MachineComponent.Builder builder) {
        return null;
    }
    
    public CafeModule() {
        super();
    }
}