package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u001c\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&\u00a8\u0006\t"}, d2 = {"Ldi/component/MapKeyComponent;", "", "getStringsByAnimal", "", "Lmodel/Animal;", "", "getStringsByNumber", "Ljava/lang/Class;", "", "dagger2"})
@dagger.Component(modules = {di.module.MapKeyModule.class})
public abstract interface MapKeyComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<model.Animal, java.lang.String> getStringsByAnimal();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.Class<? extends java.lang.Number>, java.lang.String> getStringsByNumber();
}