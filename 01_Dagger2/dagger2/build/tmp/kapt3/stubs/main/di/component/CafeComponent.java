package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldi/component/CafeComponent;", "", "inject", "", "cafe", "Lmodel/Cafe;", "dagger2"})
@dagger.Component(modules = {di.module.CafeModule.class})
public abstract interface CafeComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    model.Cafe cafe);
}