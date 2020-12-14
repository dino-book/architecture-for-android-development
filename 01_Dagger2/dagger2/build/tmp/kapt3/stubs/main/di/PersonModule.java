package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Ldi/PersonModule;", "", "()V", "provideBirthday", "", "()Ljava/lang/Integer;", "provideName", "", "dagger2"})
@dagger.Module
public final class PersonModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.lang.String provideName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @dagger.Provides
    public final java.lang.Integer provideBirthday() {
        return null;
    }
    
    public PersonModule() {
        super();
    }
}