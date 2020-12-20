package di.component;

import dagger.internal.Preconditions;
import di.module.CafeModule;
import di.module.CafeModule_ProvideMachineFactory;
import di.module.CafeModule_ProvideWaterFactory;
import di.module.MachineModule;
import di.module.MachineModule_ProvideCoffeeBeanFactory;
import javax.annotation.processing.Generated;
import model.Cafe;
import model.Cafe_MembersInjector;
import model.Coffee;
import model.Machine;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCafeComponent implements CafeComponent {
  private final CafeModule cafeModule;

  private DaggerCafeComponent(CafeModule cafeModuleParam) {
    this.cafeModule = cafeModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CafeComponent create() {
    return new Builder().build();
  }

  private Machine getMachine() {
    return CafeModule_ProvideMachineFactory.provideMachine(cafeModule, new MachineComponentBuilder());}

  @Override
  public void inject(Cafe cafe) {
    injectCafe(cafe);}

  private Cafe injectCafe(Cafe instance) {
    Cafe_MembersInjector.injectCoffeeMachine(instance, getMachine());
    return instance;
  }

  public static final class Builder {
    private CafeModule cafeModule;

    private Builder() {
    }

    public Builder cafeModule(CafeModule cafeModule) {
      this.cafeModule = Preconditions.checkNotNull(cafeModule);
      return this;
    }

    public CafeComponent build() {
      if (cafeModule == null) {
        this.cafeModule = new CafeModule();
      }
      return new DaggerCafeComponent(cafeModule);
    }
  }

  private final class MachineComponentBuilder implements MachineComponent.Builder {
    private MachineModule machineModule;

    @Override
    public MachineComponentBuilder setMachineModule(MachineModule coffeeMachineModule) {
      this.machineModule = Preconditions.checkNotNull(coffeeMachineModule);
      return this;
    }

    @Override
    public MachineComponent build() {
      if (machineModule == null) {
        this.machineModule = new MachineModule();
      }
      return new MachineComponentImpl(machineModule);
    }
  }

  private final class MachineComponentImpl implements MachineComponent {
    private final MachineModule machineModule;

    private MachineComponentImpl(MachineModule machineModuleParam) {
      this.machineModule = machineModuleParam;
    }

    @Override
    public Coffee getCoffee() {
      return new Coffee(MachineModule_ProvideCoffeeBeanFactory.provideCoffeeBean(machineModule), CafeModule_ProvideWaterFactory.provideWater(DaggerCafeComponent.this.cafeModule));}

    @Override
    public void inject(Machine machine) {
    }
  }
}
