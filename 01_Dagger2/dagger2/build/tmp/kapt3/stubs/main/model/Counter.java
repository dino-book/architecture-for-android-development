package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lmodel/Counter;", "", "()V", "lazy", "Ldagger/Lazy;", "", "getLazy", "()Ldagger/Lazy;", "setLazy", "(Ldagger/Lazy;)V", "provider", "Ljavax/inject/Provider;", "", "getProvider", "()Ljavax/inject/Provider;", "setProvider", "(Ljavax/inject/Provider;)V", "printLazy", "", "printProvider", "dagger2"})
public final class Counter {
    @javax.inject.Inject
    public dagger.Lazy<java.lang.Integer> lazy;
    @javax.inject.Inject
    public javax.inject.Provider<java.lang.Double> provider;
    
    @org.jetbrains.annotations.NotNull
    public final dagger.Lazy<java.lang.Integer> getLazy() {
        return null;
    }
    
    public final void setLazy(@org.jetbrains.annotations.NotNull
    dagger.Lazy<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javax.inject.Provider<java.lang.Double> getProvider() {
        return null;
    }
    
    public final void setProvider(@org.jetbrains.annotations.NotNull
    javax.inject.Provider<java.lang.Double> p0) {
    }
    
    public final void printLazy() {
    }
    
    public final void printProvider() {
    }
    
    public Counter() {
        super();
    }
}