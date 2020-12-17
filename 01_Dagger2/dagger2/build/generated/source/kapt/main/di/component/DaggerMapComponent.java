package di.component;

import dagger.internal.Preconditions;
import di.module.MapModule;
import di.module.MapModule_ProvideFoStrFactory;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import model.MapFoo;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMapComponent implements MapComponent {
  private final MapModule mapModule;

  private DaggerMapComponent(MapModule mapModuleParam) {
    this.mapModule = mapModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MapComponent create() {
    return new Builder().build();
  }

  @Override
  public Map<String, Long> getLongsByString() {
    return Collections.<String, Long>singletonMap("foo", mapModule.provideFooValue());}

  @Override
  public Map<Class<?>, String> getStringsByClass() {
    return Collections.<Class<?>, String>singletonMap(MapFoo.class, MapModule_ProvideFoStrFactory.provideFoStr(mapModule));}

  public static final class Builder {
    private MapModule mapModule;

    private Builder() {
    }

    public Builder mapModule(MapModule mapModule) {
      this.mapModule = Preconditions.checkNotNull(mapModule);
      return this;
    }

    public MapComponent build() {
      if (mapModule == null) {
        this.mapModule = new MapModule();
      }
      return new DaggerMapComponent(mapModule);
    }
  }
}
