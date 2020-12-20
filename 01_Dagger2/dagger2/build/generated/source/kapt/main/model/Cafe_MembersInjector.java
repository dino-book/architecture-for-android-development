package model;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Cafe_MembersInjector implements MembersInjector<Cafe> {
  private final Provider<Machine> coffeeMachineProvider;

  public Cafe_MembersInjector(Provider<Machine> coffeeMachineProvider) {
    this.coffeeMachineProvider = coffeeMachineProvider;
  }

  public static MembersInjector<Cafe> create(Provider<Machine> coffeeMachineProvider) {
    return new Cafe_MembersInjector(coffeeMachineProvider);}

  @Override
  public void injectMembers(Cafe instance) {
    injectCoffeeMachine(instance, coffeeMachineProvider.get());
  }

  @InjectedFieldSignature("model.Cafe.coffeeMachine")
  public static void injectCoffeeMachine(Cafe instance, Machine coffeeMachine) {
    instance.coffeeMachine = coffeeMachine;
  }
}
