package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lmodel/Cafe;", "", "()V", "coffeeMachine", "Lmodel/Machine;", "getCoffeeMachine", "()Lmodel/Machine;", "setCoffeeMachine", "(Lmodel/Machine;)V", "orderCoffee", "Lmodel/Coffee;", "dagger2"})
public final class Cafe {
    @javax.inject.Inject
    public model.Machine coffeeMachine;
    
    @org.jetbrains.annotations.NotNull
    public final model.Machine getCoffeeMachine() {
        return null;
    }
    
    public final void setCoffeeMachine(@org.jetbrains.annotations.NotNull
    model.Machine p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final model.Coffee orderCoffee() {
        return null;
    }
    
    public Cafe() {
        super();
    }
}