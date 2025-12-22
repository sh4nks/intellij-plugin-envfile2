package com.peterjustin.envfile.core.providers.runconfig;

import lombok.AllArgsConstructor;
import com.peterjustin.envfile.core.EnvVarsProvider;
import com.peterjustin.envfile.core.exceptions.InvalidEnvFileException;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class RunConfigEnvVarsProvider implements EnvVarsProvider {
    public static final String PARSER_ID = "runconfig";

    private final Map<String, String> baseEnvVars;

    @Override
    public Map<String, String> getEnvVars(File file, boolean isExecutable, Map<String, String> context)
            throws InvalidEnvFileException {
        if (file != null) {
            throw InvalidEnvFileException.format(
                    "%s is not supposed to be configured with a file",
                    this.getClass().getSimpleName()
            );
        }

        if (isExecutable) {
            throw InvalidEnvFileException.format(
                    "%s does not support executable mode",
                    this.getClass().getSimpleName()
            );
        }

        return new HashMap<>(baseEnvVars);
    }
}
