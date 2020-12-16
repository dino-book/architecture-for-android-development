package di.component;

import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import model.Bind;
import model.Bind_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerBindsComponent implements BindsComponent {
  private final String setString;

  private DaggerBindsComponent(String setStringParam) {
    this.setString = setStringParam;
  }

  public static BindsComponent.Builder builder() {
    return new Builder();
  }

  @Override
  public void inject(Bind bind) {
    injectBind(bind);}

  private Bind injectBind(Bind instance) {
    Bind_MembersInjector.injectStr(instance, setString);
    return instance;
  }

  private static final class Builder implements BindsComponent.Builder {
    private String setString;

    @Override
    public Builder setString(String string) {
      this.setString = Preconditions.checkNotNull(string);
      return this;
    }

    @Override
    public BindsComponent build() {
      Preconditions.checkBuilderRequirement(setString, String.class);
      return new DaggerBindsComponent(setString);
    }
  }
}
