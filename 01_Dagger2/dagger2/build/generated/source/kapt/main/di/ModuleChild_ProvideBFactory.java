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
public final class ModuleChild_ProvideBFactory implements Factory<String> {
  private final ModuleChild module;

  public ModuleChild_ProvideBFactory(ModuleChild module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideB(module);
  }

  public static ModuleChild_ProvideBFactory create(ModuleChild module) {
    return new ModuleChild_ProvideBFactory(module);
  }

  public static String provideB(ModuleChild instance) {
    return Preconditions.checkNotNull(instance.provideB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
