package com.kaykserver.multitechmod.datagen;

import com.kaykserver.multitechmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, com.kaykserver.multitechmod.MultiTechMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
                .add(Registration.MYSTERIOUS_ORE_END.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());

//        tag(Registration.MYSTERIOUS_ORE)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
