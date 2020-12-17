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
public final class MapKeyModule_ProvideIntValueFactory implements Factory<String> {
  private final MapKeyModule module;

  public MapKeyModule_ProvideIntValueFactory(MapKeyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideIntValue(module);
  }

  public static MapKeyModule_ProvideIntValueFactory create(MapKeyModule module) {
    return new MapKeyModule_ProvideIntValueFactory(module);
  }

  public static String provideIntValue(MapKeyModule instance) {
    return Preconditions.checkNotNull(instance.provideIntValue(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
