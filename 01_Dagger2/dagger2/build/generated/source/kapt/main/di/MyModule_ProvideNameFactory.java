package di;

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
public final class MyModule_ProvideNameFactory implements Factory<String> {
  private final MyModule module;

  public MyModule_ProvideNameFactory(MyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideName(module);
  }

  public static MyModule_ProvideNameFactory create(MyModule module) {
    return new MyModule_ProvideNameFactory(module);
  }

  public static String provideName(MyModule instance) {
    return Preconditions.checkNotNull(instance.provideName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
