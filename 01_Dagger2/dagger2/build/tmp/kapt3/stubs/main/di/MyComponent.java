package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H&\u00a8\u0006\u0010"}, d2 = {"Ldi/MyComponent;", "", "getDouble", "", "()Ljava/lang/Double;", "getSomeType", "Lmodel/SomeType;", "getString", "", "inject", "", "myClass", "Lmodel/MyClass;", "injectAndReturnSomeType", "someType", "injectSomeType", "dagger2"})
@dagger.Component(modules = {di.MyModule.class})
public abstract interface MyComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getString();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Double getDouble();
    
    @org.jetbrains.annotations.NotNull
    public abstract model.SomeType getSomeType();
    
    public abstract void injectSomeType(@org.jetbrains.annotations.NotNull
    model.SomeType someType);
    
    public abstract void injectAndReturnSomeType(@org.jetbrains.annotations.NotNull
    model.SomeType someType);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    model.MyClass myClass);
}