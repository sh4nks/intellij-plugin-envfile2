package com.peterjustin.envfile.core.providers.runconfig;

import com.peterjustin.envfile.core.EnvVarsProvider;
import com.peterjustin.envfile.core.EnvVarsProviderFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Consumer;

public class RunConfigEnvVarsProviderFactory implements EnvVarsProviderFactory {

    @Override
    public EnvVarsProvider createProvider(Map<String, String> baseEnvVars, Consumer<String> logger) {
        return new RunConfigEnvVarsProvider(baseEnvVars);
    }

    @Override
    public @NotNull String getTitle() {
        return "Run Config";
    }

    @Override
    public boolean isEditable() {
        return false;
    }

}
