package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ldi/component/PersonComponent;", "", "getPersonA", "Lmodel/PersonA;", "inject", "", "personB", "Lmodel/PersonB;", "dagger2"})
@dagger.Component(modules = {di.module.PersonModule.class})
public abstract interface PersonComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract model.PersonA getPersonA();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    model.PersonB personB);
}