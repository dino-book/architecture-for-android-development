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
public final class PersonModule_ProvideNameFactory implements Factory<String> {
  private final PersonModule module;

  public PersonModule_ProvideNameFactory(PersonModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideName(module);
  }

  public static PersonModule_ProvideNameFactory create(PersonModule module) {
    return new PersonModule_ProvideNameFactory(module);
  }

  public static String provideName(PersonModule instance) {
    return Preconditions.checkNotNull(instance.provideName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
