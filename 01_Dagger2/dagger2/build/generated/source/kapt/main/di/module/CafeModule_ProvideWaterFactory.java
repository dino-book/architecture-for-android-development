package di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import model.Water;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CafeModule_ProvideWaterFactory implements Factory<Water> {
  private final CafeModule module;

  public CafeModule_ProvideWaterFactory(CafeModule module) {
    this.module = module;
  }

  @Override
  public Water get() {
    return provideWater(module);
  }

  public static CafeModule_ProvideWaterFactory create(CafeModule module) {
    return new CafeModule_ProvideWaterFactory(module);
  }

  public static Water provideWater(CafeModule instance) {
    return Preconditions.checkNotNull(instance.provideWater(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
