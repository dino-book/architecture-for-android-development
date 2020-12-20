package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Ldi/component/MachineComponent;", "", "getCoffee", "Lmodel/Coffee;", "inject", "", "machine", "Lmodel/Machine;", "Builder", "dagger2"})
@dagger.Subcomponent(modules = {di.module.MachineModule.class})
public abstract interface MachineComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract model.Coffee getCoffee();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    model.Machine machine);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Ldi/component/MachineComponent$Builder;", "", "build", "Ldi/component/MachineComponent;", "setMachineModule", "coffeeMachineModule", "Ldi/module/MachineModule;", "dagger2"})
    @dagger.Subcomponent.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract di.component.MachineComponent.Builder setMachineModule(@org.jetbrains.annotations.NotNull
        di.module.MachineModule coffeeMachineModule);
        
        @org.jetbrains.annotations.NotNull
        public abstract di.component.MachineComponent build();
    }
}