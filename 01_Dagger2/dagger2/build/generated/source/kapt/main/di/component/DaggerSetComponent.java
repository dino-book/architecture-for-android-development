package di.component;

import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import di.module.SetModule;
import di.module.SetModule_ProvideHelloFactory;
import di.module.SetModule_ProvideSetFactory;
import di.module.SetModule_ProvideWorldFactory;
import java.util.Set;
import javax.annotation.processing.Generated;
import model.SetFoo;
import model.SetFoo_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSetComponent implements SetComponent {
  private final SetModule setModule;

  private DaggerSetComponent(SetModule setModuleParam) {
    this.setModule = setModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SetComponent create() {
    return new Builder().build();
  }

  private Set<String> getSetOfString() {
    return SetBuilder.<String>newSetBuilder(3).add(SetModule_ProvideHelloFactory.provideHello(setModule)).add(SetModule_ProvideWorldFactory.provideWorld(setModule)).addAll(SetModule_ProvideSetFactory.provideSet(setModule)).build();}

  @Override
  public void inject(SetFoo foo) {
    injectSetFoo(foo);}

  private SetFoo injectSetFoo(SetFoo instance) {
    SetFoo_MembersInjector.injectStrings(instance, getSetOfString());
    return instance;
  }

  public static final class Builder {
    private SetModule setModule;

    private Builder() {
    }

    public Builder setModule(SetModule setModule) {
      this.setModule = Preconditions.checkNotNull(setModule);
      return this;
    }

    public SetComponent build() {
      if (setModule == null) {
        this.setModule = new SetModule();
      }
      return new DaggerSetComponent(setModule);
    }
  }
}
