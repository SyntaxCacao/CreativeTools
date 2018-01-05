package de.skeletoneye.creative.api.data;

import org.bukkit.World;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public abstract class DataObject
{
    private String name;
    private transient @Setter World context;
}
