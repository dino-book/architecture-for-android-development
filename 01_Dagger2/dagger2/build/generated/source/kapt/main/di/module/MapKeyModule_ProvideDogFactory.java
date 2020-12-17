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
public final class MapKeyModule_ProvideDogFactory implements Factory<String> {
  private final MapKeyModule module;

  public MapKeyModule_ProvideDogFactory(MapKeyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideDog(module);
  }

  public static MapKeyModule_ProvideDogFactory create(MapKeyModule module) {
    return new MapKeyModule_ProvideDogFactory(module);
  }

  public static String provideDog(MapKeyModule instance) {
    return Preconditions.checkNotNull(instance.provideDog(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
