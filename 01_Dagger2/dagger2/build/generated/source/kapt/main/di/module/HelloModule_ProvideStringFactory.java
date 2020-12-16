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
public final class HelloModule_ProvideStringFactory implements Factory<String> {
  private final HelloModule module;

  public HelloModule_ProvideStringFactory(HelloModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideString(module);
  }

  public static HelloModule_ProvideStringFactory create(HelloModule module) {
    return new HelloModule_ProvideStringFactory(module);
  }

  public static String provideString(HelloModule instance) {
    return Preconditions.checkNotNull(instance.provideString(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
