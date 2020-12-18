package di.component;

import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import di.module.SubModule;
import di.module.SubModule_String3Factory;
import di.module.SubModule_String4Factory;
import di.module.SuperModule;
import di.module.SuperModule_String1Factory;
import di.module.SuperModule_String2Factory;
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
public final class DaggerSuperComponent implements SuperComponent {
  private final SuperModule superModule;

  private DaggerSuperComponent(SuperModule superModuleParam) {
    this.superModule = superModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SuperComponent create() {
    return new Builder().build();
  }

  @Override
  public Set<String> strings() {
    return SetBuilder.<String>newSetBuilder(2).add(SuperModule_String1Factory.string1(superModule)).add(SuperModule_String2Factory.string2(superModule)).build();}

  @Override
  public SubComponent.Builder subComponentBuilder() {
    return new SubComponentBuilder();}

  public static final class Builder {
    private SuperModule superModule;

    private Builder() {
    }

    public Builder superModule(SuperModule superModule) {
      this.superModule = Preconditions.checkNotNull(superModule);
      return this;
    }

    public SuperComponent build() {
      if (superModule == null) {
        this.superModule = new SuperModule();
      }
      return new DaggerSuperComponent(superModule);
    }
  }

  private final class SubComponentBuilder implements SubComponent.Builder {
    @Override
    public SubComponent build() {
      return new SubComponentImpl(new SubModule());
    }
  }

  private final class SubComponentImpl implements SubComponent {
    private final SubModule subModule;

    private SubComponentImpl(SubModule subModuleParam) {
      this.subModule = subModuleParam;
    }

    @Override
    public Set<String> strings() {
      return SetBuilder.<String>newSetBuilder(4).add(SuperModule_String1Factory.string1(DaggerSuperComponent.this.superModule)).add(SuperModule_String2Factory.string2(DaggerSuperComponent.this.superModule)).add(SubModule_String3Factory.string3(subModule)).add(SubModule_String4Factory.string4(subModule)).build();}
  }
}
