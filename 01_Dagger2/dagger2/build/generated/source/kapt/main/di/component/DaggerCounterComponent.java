package di.component;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import di.module.CounterModule;
import di.module.CounterModule_ProvideDoubleFactory;
import di.module.CounterModule_ProvideIntegerFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import model.Counter;
import model.Counter_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCounterComponent implements CounterComponent {
  private Provider<Integer> provideIntegerProvider;

  private Provider<Double> provideDoubleProvider;

  private DaggerCounterComponent(CounterModule counterModuleParam) {

    initialize(counterModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CounterComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final CounterModule counterModuleParam) {
    this.provideIntegerProvider = CounterModule_ProvideIntegerFactory.create(counterModuleParam);
    this.provideDoubleProvider = CounterModule_ProvideDoubleFactory.create(counterModuleParam);
  }

  @Override
  public void inject(Counter counter) {
    injectCounter(counter);}

  private Counter injectCounter(Counter instance) {
    Counter_MembersInjector.injectLazy(instance, DoubleCheck.lazy(provideIntegerProvider));
    Counter_MembersInjector.injectProvider(instance, provideDoubleProvider);
    return instance;
  }

  public static final class Builder {
    private CounterModule counterModule;

    private Builder() {
    }

    public Builder counterModule(CounterModule counterModule) {
      this.counterModule = Preconditions.checkNotNull(counterModule);
      return this;
    }

    public CounterComponent build() {
      if (counterModule == null) {
        this.counterModule = new CounterModule();
      }
      return new DaggerCounterComponent(counterModule);
    }
  }
}
