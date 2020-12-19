package di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Ldi/module/MultiBindsModule;", "", "()V", "strings", "", "", "dagger2"})
@dagger.Module
public abstract class MultiBindsModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.multibindings.Multibinds
    public abstract java.util.Set<java.lang.String> strings();
    
    public MultiBindsModule() {
        super();
    }
}