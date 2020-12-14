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
public final class ModuleParent_ProvideAFactory implements Factory<String> {
  private final ModuleParent module;

  public ModuleParent_ProvideAFactory(ModuleParent module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideA(module);
  }

  public static ModuleParent_ProvideAFactory create(ModuleParent module) {
    return new ModuleParent_ProvideAFactory(module);
  }

  public static String provideA(ModuleParent instance) {
    return Preconditions.checkNotNull(instance.provideA(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
