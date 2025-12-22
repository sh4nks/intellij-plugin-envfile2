package com.peterjustin.envfile.core.providers.dotenv;

import com.peterjustin.envfile.core.EnvVarsProvider;
import com.peterjustin.envfile.core.EnvVarsProviderFactory;
import com.peterjustin.envfile.core.providers.EnvFileExecutor;
import com.peterjustin.envfile.core.providers.EnvFileReader;
import com.peterjustin.envfile.core.providers.SingleFileEnvVarsProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Consumer;

public class DotEnvFileParserFactory implements EnvVarsProviderFactory {

    @Override
    public EnvVarsProvider createProvider(Map<String, String> baseEnvVars, Consumer<String> logger) {
        return SingleFileEnvVarsProvider.builder()
                .reader(EnvFileReader.DEFAULT)
                .executor(EnvFileExecutor.DEFAULT)
                .parser(DotEnvFileParser.INSTANCE)
                .logger(logger)
                .build();
    }


    @Override
    public @NotNull String getTitle() {
        return ".env";
    }

    @Override
    public boolean isEditable() {
        return true;
    }

}
