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
public final class SuperModule_String1Factory implements Factory<String> {
  private final SuperModule module;

  public SuperModule_String1Factory(SuperModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return string1(module);
  }

  public static SuperModule_String1Factory create(SuperModule module) {
    return new SuperModule_String1Factory(module);
  }

  public static String string1(SuperModule instance) {
    return Preconditions.checkNotNull(instance.string1(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
