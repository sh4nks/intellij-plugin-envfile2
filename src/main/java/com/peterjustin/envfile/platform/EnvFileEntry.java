package com.peterjustin.envfile.platform;

import com.jetbrains.rhizomedb.Unique;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an EnvFile entry from the run configuration config table.
 */
@Data
@Builder
public class EnvFileEntry {

    @NonNull
    private final String id;

    @NonNull
    private final String parserId;

    private String path;

    @NonNull
    private Boolean enabled;

    @NonNull
    private Boolean executable;

    public boolean isEnabled() {
        return getEnabled();
    }

    public boolean isExecutable() {
        return getExecutable();
    }

}
