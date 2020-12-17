package di.module;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapModule_ProvideFooValueFactory implements Factory<Long> {
  private final MapModule module;

  public MapModule_ProvideFooValueFactory(MapModule module) {
    this.module = module;
  }

  @Override
  public Long get() {
    return provideFooValue(module);
  }

  public static MapModule_ProvideFooValueFactory create(MapModule module) {
    return new MapModule_ProvideFooValueFactory(module);
  }

  public static long provideFooValue(MapModule instance) {
    return instance.provideFooValue();
  }
}
