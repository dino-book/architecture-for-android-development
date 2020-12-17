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
public final class MapKeyModule_ProvideCatFactory implements Factory<String> {
  private final MapKeyModule module;

  public MapKeyModule_ProvideCatFactory(MapKeyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideCat(module);
  }

  public static MapKeyModule_ProvideCatFactory create(MapKeyModule module) {
    return new MapKeyModule_ProvideCatFactory(module);
  }

  public static String provideCat(MapKeyModule instance) {
    return Preconditions.checkNotNull(instance.provideCat(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
