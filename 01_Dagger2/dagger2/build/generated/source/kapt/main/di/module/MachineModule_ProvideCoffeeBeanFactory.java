package di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import model.CoffeeBean;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MachineModule_ProvideCoffeeBeanFactory implements Factory<CoffeeBean> {
  private final MachineModule module;

  public MachineModule_ProvideCoffeeBeanFactory(MachineModule module) {
    this.module = module;
  }

  @Override
  public CoffeeBean get() {
    return provideCoffeeBean(module);
  }

  public static MachineModule_ProvideCoffeeBeanFactory create(MachineModule module) {
    return new MachineModule_ProvideCoffeeBeanFactory(module);
  }

  public static CoffeeBean provideCoffeeBean(MachineModule instance) {
    return Preconditions.checkNotNull(instance.provideCoffeeBean(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
