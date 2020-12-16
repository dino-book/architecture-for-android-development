package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Ldi/CounterModule;", "", "()V", "next", "", "getNext", "()I", "setNext", "(I)V", "nextDouble", "", "getNextDouble", "()D", "setNextDouble", "(D)V", "provideDouble", "provideInteger", "dagger2"})
@dagger.Module
public final class CounterModule {
    private int next = 100;
    private double nextDouble = 100.0;
    
    public final int getNext() {
        return 0;
    }
    
    public final void setNext(int p0) {
    }
    
    public final double getNextDouble() {
        return 0.0;
    }
    
    public final void setNextDouble(double p0) {
    }
    
    @dagger.Provides
    public final int provideInteger() {
        return 0;
    }
    
    @dagger.Provides
    public final double provideDouble() {
        return 0.0;
    }
    
    public CounterModule() {
        super();
    }
}