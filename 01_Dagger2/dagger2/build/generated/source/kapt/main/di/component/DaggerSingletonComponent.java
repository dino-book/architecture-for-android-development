package di.component;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import di.module.SingletonModule;
import di.module.SingletonModule_ProvideAnyFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSingletonComponent implements SingletonComponent {
  private Provider<Object> provideAnyProvider;

  private DaggerSingletonComponent(SingletonModule singletonModuleParam) {

    initialize(singletonModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SingletonComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final SingletonModule singletonModuleParam) {
    this.provideAnyProvider = DoubleCheck.provider(SingletonModule_ProvideAnyFactory.create(singletonModuleParam));
  }

  @Override
  public Object getAny() {
    return provideAnyProvider.get();}

  public static final class Builder {
    private SingletonModule singletonModule;

    private Builder() {
    }

    public Builder singletonModule(SingletonModule singletonModule) {
      this.singletonModule = Preconditions.checkNotNull(singletonModule);
      return this;
    }

    public SingletonComponent build() {
      if (singletonModule == null) {
        this.singletonModule = new SingletonModule();
      }
      return new DaggerSingletonComponent(singletonModule);
    }
  }
}
