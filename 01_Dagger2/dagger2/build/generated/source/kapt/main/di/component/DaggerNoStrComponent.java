package di.component;

import java.util.Optional;
import javax.annotation.processing.Generated;
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
public final class DaggerNoStrComponent implements NoStrComponent {
  private DaggerNoStrComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static NoStrComponent create() {
    return new Builder().build();
  }

  @Override
  public void inject(Foo foo) {
    injectFoo(foo);}

  private Foo injectFoo(Foo instance) {
    Foo_MembersInjector.injectStr(instance, Optional.empty());
    Foo_MembersInjector.injectStr2(instance, Optional.empty());
    Foo_MembersInjector.injectStr3(instance, Optional.empty());
    return instance;
  }

  public static final class Builder {
    private Builder() {
    }

    public NoStrComponent build() {
      return new DaggerNoStrComponent();
    }
  }
}
