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
public final class SubModule_String4Factory implements Factory<String> {
  private final SubModule module;

  public SubModule_String4Factory(SubModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return string4(module);
  }

  public static SubModule_String4Factory create(SubModule module) {
    return new SubModule_String4Factory(module);
  }

  public static String string4(SubModule instance) {
    return Preconditions.checkNotNull(instance.string4(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
