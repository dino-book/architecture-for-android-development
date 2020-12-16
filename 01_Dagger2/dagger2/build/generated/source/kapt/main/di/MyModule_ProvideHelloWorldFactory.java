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
public final class MyModule_ProvideHelloWorldFactory implements Factory<String> {
  private final MyModule module;

  public MyModule_ProvideHelloWorldFactory(MyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideHelloWorld(module);
  }

  public static MyModule_ProvideHelloWorldFactory create(MyModule module) {
    return new MyModule_ProvideHelloWorldFactory(module);
  }

  public static String provideHelloWorld(MyModule instance) {
    return Preconditions.checkNotNull(instance.provideHelloWorld(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
