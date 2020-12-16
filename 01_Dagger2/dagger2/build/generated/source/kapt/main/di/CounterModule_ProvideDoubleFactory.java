package di;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CounterModule_ProvideDoubleFactory implements Factory<Double> {
  private final CounterModule module;

  public CounterModule_ProvideDoubleFactory(CounterModule module) {
    this.module = module;
  }

  @Override
  public Double get() {
    return provideDouble(module);
  }

  public static CounterModule_ProvideDoubleFactory create(CounterModule module) {
    return new CounterModule_ProvideDoubleFactory(module);
  }

  public static double provideDouble(CounterModule instance) {
    return instance.provideDouble();
  }
}
