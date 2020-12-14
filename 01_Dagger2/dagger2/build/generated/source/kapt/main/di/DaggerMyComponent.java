package di;

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
public final class DaggerMyComponent implements MyComponent {
  private final MyModule myModule;

  private DaggerMyComponent(MyModule myModuleParam) {
    this.myModule = myModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return new Builder().build();
  }

  @Override
  public String getString() {
    return MyModule_ProvideNameFactory.provideName(myModule);}

  @Override
  public Double getDouble() {
    return myModule.provideDouble();}

  public static final class Builder {
    private MyModule myModule;

    private Builder() {
    }

    public Builder myModule(MyModule myModule) {
      this.myModule = Preconditions.checkNotNull(myModule);
      return this;
    }

    public MyComponent build() {
      if (myModule == null) {
        this.myModule = new MyModule();
      }
      return new DaggerMyComponent(myModule);
    }
  }
}
