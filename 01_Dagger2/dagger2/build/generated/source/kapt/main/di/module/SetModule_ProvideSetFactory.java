package di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SetModule_ProvideSetFactory implements Factory<Set<String>> {
  private final SetModule module;

  public SetModule_ProvideSetFactory(SetModule module) {
    this.module = module;
  }

  @Override
  public Set<String> get() {
    return provideSet(module);
  }

  public static SetModule_ProvideSetFactory create(SetModule module) {
    return new SetModule_ProvideSetFactory(module);
  }

  public static Set<String> provideSet(SetModule instance) {
    return Preconditions.checkNotNull(instance.provideSet(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
