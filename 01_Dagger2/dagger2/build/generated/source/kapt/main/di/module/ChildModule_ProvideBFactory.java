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
public final class ChildModule_ProvideBFactory implements Factory<String> {
  private final ChildModule module;

  public ChildModule_ProvideBFactory(ChildModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideB(module);
  }

  public static ChildModule_ProvideBFactory create(ChildModule module) {
    return new ChildModule_ProvideBFactory(module);
  }

  public static String provideB(ChildModule instance) {
    return Preconditions.checkNotNull(instance.provideB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
