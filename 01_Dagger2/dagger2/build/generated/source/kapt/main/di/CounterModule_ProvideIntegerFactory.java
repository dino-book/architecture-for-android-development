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
public final class CounterModule_ProvideIntegerFactory implements Factory<Integer> {
  private final CounterModule module;

  public CounterModule_ProvideIntegerFactory(CounterModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideInteger(module);
  }

  public static CounterModule_ProvideIntegerFactory create(CounterModule module) {
    return new CounterModule_ProvideIntegerFactory(module);
  }

  public static int provideInteger(CounterModule instance) {
    return instance.provideInteger();
  }
}
