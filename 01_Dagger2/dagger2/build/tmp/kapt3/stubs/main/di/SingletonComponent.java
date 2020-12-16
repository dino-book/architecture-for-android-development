package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H&\u00a8\u0006\u0003"}, d2 = {"Ldi/SingletonComponent;", "", "getAny", "dagger2"})
@dagger.Component(modules = {di.SingletonModule.class})
@javax.inject.Singleton
public abstract interface SingletonComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Object getAny();
}