package di.component;

import java.util.Collections;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMultiBindsComponent implements MultiBindsComponent {
  private DaggerMultiBindsComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static MultiBindsComponent create() {
    return new Builder().build();
  }

  @Override
  public Set<String> getStrings() {
    return Collections.<String>emptySet();}

  public static final class Builder {
    private Builder() {
    }

    public MultiBindsComponent build() {
      return new DaggerMultiBindsComponent();
    }
  }
}
