package com.novamachina.ens.common.registry.defaults;

import com.novamachina.ens.common.registry.CrookRegistry;
import com.novamachina.ens.common.registry.registryitem.CrookRegistryItem;
import com.novamachina.ens.common.setup.Registration;

public class DefaultCrookRegistry {

    private final CrookRegistry crookRegistry;

    public DefaultCrookRegistry(CrookRegistry crookRegistry) {
        this.crookRegistry = crookRegistry;
    }

    public void init() {
        crookRegistry.register(new CrookRegistryItem(Registration.ITEM_SILKWORM.get()));
    }
}
