package model;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
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
public final class Counter_MembersInjector implements MembersInjector<Counter> {
  private final Provider<Integer> lazyProvider;

  private final Provider<Double> providerProvider;

  public Counter_MembersInjector(Provider<Integer> lazyProvider,
      Provider<Double> providerProvider) {
    this.lazyProvider = lazyProvider;
    this.providerProvider = providerProvider;
  }

  public static MembersInjector<Counter> create(Provider<Integer> lazyProvider,
      Provider<Double> providerProvider) {
    return new Counter_MembersInjector(lazyProvider, providerProvider);}

  @Override
  public void injectMembers(Counter instance) {
    injectLazy(instance, DoubleCheck.lazy(lazyProvider));
    injectProvider(instance, providerProvider);
  }

  @InjectedFieldSignature("model.Counter.lazy")
  public static void injectLazy(Counter instance, Lazy<Integer> lazy) {
    instance.lazy = lazy;
  }

  @InjectedFieldSignature("model.Counter.provider")
  public static void injectProvider(Counter instance, Provider<Double> provider) {
    instance.provider = provider;
  }
}
