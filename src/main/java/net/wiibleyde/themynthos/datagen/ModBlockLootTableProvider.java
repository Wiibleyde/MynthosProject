package net.wiibleyde.themynthos.datagen;

import net.minecraft.world.flag.FeatureFlags;
import net.wiibleyde.themynthos.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.PALM_TREE_LOG.get());
        dropSelf(ModBlocks.PALM_TREE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PALM_TREE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PALM_TREE_WOOD.get());
        dropSelf(ModBlocks.PALM_TREE_PLANKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}