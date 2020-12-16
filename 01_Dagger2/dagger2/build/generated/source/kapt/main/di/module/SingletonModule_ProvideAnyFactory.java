package di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SingletonModule_ProvideAnyFactory implements Factory<Object> {
  private final SingletonModule module;

  public SingletonModule_ProvideAnyFactory(SingletonModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideAny(module);
  }

  public static SingletonModule_ProvideAnyFactory create(SingletonModule module) {
    return new SingletonModule_ProvideAnyFactory(module);
  }

  public static Object provideAny(SingletonModule instance) {
    return Preconditions.checkNotNull(instance.provideAny(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
