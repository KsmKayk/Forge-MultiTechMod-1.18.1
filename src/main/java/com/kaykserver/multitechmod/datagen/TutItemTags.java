package com.kaykserver.multitechmod.datagen;

import com.kaykserver.multitechmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags extends ItemTagsProvider {

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, com.kaykserver.multitechmod.MultiTechMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
//        tag(Registration.MYSTERIOUS_ORE_ITEM)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
