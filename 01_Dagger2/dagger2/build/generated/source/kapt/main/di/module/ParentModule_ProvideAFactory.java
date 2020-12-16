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
public final class ParentModule_ProvideAFactory implements Factory<String> {
  private final ParentModule module;

  public ParentModule_ProvideAFactory(ParentModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideA(module);
  }

  public static ParentModule_ProvideAFactory create(ParentModule module) {
    return new ParentModule_ProvideAFactory(module);
  }

  public static String provideA(ParentModule instance) {
    return Preconditions.checkNotNull(instance.provideA(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
