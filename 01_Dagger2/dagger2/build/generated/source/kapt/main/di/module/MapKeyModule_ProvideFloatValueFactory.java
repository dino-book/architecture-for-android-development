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
public final class MapKeyModule_ProvideFloatValueFactory implements Factory<String> {
  private final MapKeyModule module;

  public MapKeyModule_ProvideFloatValueFactory(MapKeyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideFloatValue(module);
  }

  public static MapKeyModule_ProvideFloatValueFactory create(MapKeyModule module) {
    return new MapKeyModule_ProvideFloatValueFactory(module);
  }

  public static String provideFloatValue(MapKeyModule instance) {
    return Preconditions.checkNotNull(instance.provideFloatValue(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
