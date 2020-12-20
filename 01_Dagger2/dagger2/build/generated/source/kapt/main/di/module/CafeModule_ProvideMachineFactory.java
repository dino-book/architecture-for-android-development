package di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import di.component.MachineComponent;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import model.Machine;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CafeModule_ProvideMachineFactory implements Factory<Machine> {
  private final CafeModule module;

  private final Provider<MachineComponent.Builder> builderProvider;

  public CafeModule_ProvideMachineFactory(CafeModule module,
      Provider<MachineComponent.Builder> builderProvider) {
    this.module = module;
    this.builderProvider = builderProvider;
  }

  @Override
  public Machine get() {
    return provideMachine(module, builderProvider.get());
  }

  public static CafeModule_ProvideMachineFactory create(CafeModule module,
      Provider<MachineComponent.Builder> builderProvider) {
    return new CafeModule_ProvideMachineFactory(module, builderProvider);
  }

  public static Machine provideMachine(CafeModule instance, MachineComponent.Builder builder) {
    return Preconditions.checkNotNull(instance.provideMachine(builder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
