package di.component;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import di.module.HelloModule;
import di.module.HelloModule_ProvideStringFactory;
import java.util.Optional;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import model.Foo;
import model.Foo_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerStrComponent implements StrComponent {
  private final HelloModule helloModule;

  private Provider<String> provideStringProvider;

  private DaggerStrComponent(HelloModule helloModuleParam) {
    this.helloModule = helloModuleParam;
    initialize(helloModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static StrComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final HelloModule helloModuleParam) {
    this.provideStringProvider = HelloModule_ProvideStringFactory.create(helloModuleParam);
  }

  @Override
  public void inject(Foo foo) {
    injectFoo(foo);}

  private Foo injectFoo(Foo instance) {
    Foo_MembersInjector.injectStr(instance, Optional.of(HelloModule_ProvideStringFactory.provideString(helloModule)));
    Foo_MembersInjector.injectStr2(instance, Optional.of(provideStringProvider));
    Foo_MembersInjector.injectStr3(instance, Optional.of(DoubleCheck.lazy(provideStringProvider)));
    return instance;
  }

  public static final class Builder {
    private HelloModule helloModule;

    private Builder() {
    }

    public Builder helloModule(HelloModule helloModule) {
      this.helloModule = Preconditions.checkNotNull(helloModule);
      return this;
    }

    public StrComponent build() {
      if (helloModule == null) {
        this.helloModule = new HelloModule();
      }
      return new DaggerStrComponent(helloModule);
    }
  }
}
