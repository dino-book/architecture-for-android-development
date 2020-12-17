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
public final class SetModule_ProvideWorldFactory implements Factory<String> {
  private final SetModule module;

  public SetModule_ProvideWorldFactory(SetModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideWorld(module);
  }

  public static SetModule_ProvideWorldFactory create(SetModule module) {
    return new SetModule_ProvideWorldFactory(module);
  }

  public static String provideWorld(SetModule instance) {
    return Preconditions.checkNotNull(instance.provideWorld(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
