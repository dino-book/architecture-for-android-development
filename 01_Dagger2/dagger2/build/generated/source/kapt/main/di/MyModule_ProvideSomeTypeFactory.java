package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import model.SomeType;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyModule_ProvideSomeTypeFactory implements Factory<SomeType> {
  private final MyModule module;

  public MyModule_ProvideSomeTypeFactory(MyModule module) {
    this.module = module;
  }

  @Override
  public SomeType get() {
    return provideSomeType(module);
  }

  public static MyModule_ProvideSomeTypeFactory create(MyModule module) {
    return new MyModule_ProvideSomeTypeFactory(module);
  }

  public static SomeType provideSomeType(MyModule instance) {
    return Preconditions.checkNotNull(instance.provideSomeType(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
