package com.novamachina.ens.common.item.tools.crook;

import com.novamachina.ens.ExNihiloSequentia;
import com.novamachina.ens.common.setup.ModItems;
import com.novamachina.ens.common.utility.Config;
import com.novamachina.ens.common.utility.Constants.Items;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.item.ItemStack;

public class CrookDrops {

    public static final int numberOfTimesToTestVanillaDrops = Config.NUMBER_OF_TIMES_TO_TEST_VANILLA_DROPS
        .get();

    private static final List<CrookDropEntry> crookDrops  = new ArrayList<>();
    private static       boolean              initialized = false;

    public static void useDefaults() {
        if (!ExNihiloSequentia.itemRegistrationFinished) {
            return;
        }
        crookDrops.add(new CrookDropEntry(ModItems.resourceMap.get(Items.SILKWORM).get(), 0.3));
    }

    public static List<ItemStack> getDrops() {
        if (!initialized) {
            useDefaults();
            initialized = true;
        }

        List<ItemStack> drops = new ArrayList<>();

        for (CrookDropEntry item : crookDrops) {
            Random random = new Random();
            if (random.nextDouble() <= item.getRarity()) {
                drops.add(new ItemStack(item.getItem()));
            }
        }

        return drops;
    }
}