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
public final class SetModule_ProvideHelloFactory implements Factory<String> {
  private final SetModule module;

  public SetModule_ProvideHelloFactory(SetModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideHello(module);
  }

  public static SetModule_ProvideHelloFactory create(SetModule module) {
    return new SetModule_ProvideHelloFactory(module);
  }

  public static String provideHello(SetModule instance) {
    return Preconditions.checkNotNull(instance.provideHello(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
