package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0018\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\b"}, d2 = {"Ldi/component/MapComponent;", "", "getLongsByString", "", "", "", "getStringsByClass", "Ljava/lang/Class;", "dagger2"})
@dagger.Component(modules = {di.module.MapModule.class})
public abstract interface MapComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.String, java.lang.Long> getLongsByString();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.Class<?>, java.lang.String> getStringsByClass();
}