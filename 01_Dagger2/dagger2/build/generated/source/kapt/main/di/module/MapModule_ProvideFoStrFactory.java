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
public final class MapModule_ProvideFoStrFactory implements Factory<String> {
  private final MapModule module;

  public MapModule_ProvideFoStrFactory(MapModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideFoStr(module);
  }

  public static MapModule_ProvideFoStrFactory create(MapModule module) {
    return new MapModule_ProvideFoStrFactory(module);
  }

  public static String provideFoStr(MapModule instance) {
    return Preconditions.checkNotNull(instance.provideFoStr(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
