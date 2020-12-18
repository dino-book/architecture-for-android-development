package di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Ldi/component/SubComponent;", "", "strings", "", "", "Builder", "dagger2"})
@dagger.Subcomponent(modules = {di.module.SubModule.class})
public abstract interface SubComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Set<java.lang.String> strings();
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ldi/component/SubComponent$Builder;", "", "build", "Ldi/component/SubComponent;", "dagger2"})
    @dagger.Subcomponent.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract di.component.SubComponent build();
    }
}