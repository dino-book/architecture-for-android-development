package di.component;

import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import di.module.MapKeyModule;
import di.module.MapKeyModule_ProvideCatFactory;
import di.module.MapKeyModule_ProvideDogFactory;
import di.module.MapKeyModule_ProvideFloatValueFactory;
import di.module.MapKeyModule_ProvideIntValueFactory;
import java.util.Map;
import javax.annotation.processing.Generated;
import model.Animal;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMapKeyComponent implements MapKeyComponent {
  private final MapKeyModule mapKeyModule;

  private DaggerMapKeyComponent(MapKeyModule mapKeyModuleParam) {
    this.mapKeyModule = mapKeyModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MapKeyComponent create() {
    return new Builder().build();
  }

  @Override
  public Map<Animal, String> getStringsByAnimal() {
    return MapBuilder.<Animal, String>newMapBuilder(2).put(Animal.CAT, MapKeyModule_ProvideCatFactory.provideCat(mapKeyModule)).put(Animal.DOG, MapKeyModule_ProvideDogFactory.provideDog(mapKeyModule)).build();}

  @Override
  public Map<Class<? extends Number>, String> getStringsByNumber() {
    return MapBuilder.<Class<? extends Number>, String>newMapBuilder(2).put(float.class, MapKeyModule_ProvideFloatValueFactory.provideFloatValue(mapKeyModule)).put(int.class, MapKeyModule_ProvideIntValueFactory.provideIntValue(mapKeyModule)).build();}

  public static final class Builder {
    private MapKeyModule mapKeyModule;

    private Builder() {
    }

    public Builder mapKeyModule(MapKeyModule mapKeyModule) {
      this.mapKeyModule = Preconditions.checkNotNull(mapKeyModule);
      return this;
    }

    public MapKeyComponent build() {
      if (mapKeyModule == null) {
        this.mapKeyModule = new MapKeyModule();
      }
      return new DaggerMapKeyComponent(mapKeyModule);
    }
  }
}
