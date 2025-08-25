package nekonesse.minecraftexp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ExperiencedEnglishLangProvider extends FabricLanguageProvider {

    public ExperiencedEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.minecraft-experienced.cobblestone_bricks", "Cobblestone Bricks");
        translationBuilder.add("item.minecraft-experienced.layered_cobblestone_bricks", "Layered Cobblestone Bricks");
        translationBuilder.add("item.minecraft-experienced.stacked_cobblestone_bricks", "Stacked Cobblestone Bricks");
        translationBuilder.add("item.minecraft-experienced.cut_cobblestone_bricks", "Cut Cobblestone Bricks");
        translationBuilder.add("item.minecraft-experienced.small_cobblestone_bricks", "Small Cobblestone Bricks");
        translationBuilder.add("item.minecraft-experienced.layered_stone_bricks", "Layered Stone Bricks");
        translationBuilder.add("item.minecraft-experienced.stacked_stone_bricks", "Stacked Stone Bricks");
        translationBuilder.add("item.minecraft-experienced.cut_stone_bricks", "Cut Stone Bricks");
        translationBuilder.add("item.minecraft-experienced.small_stone_bricks", "Small Stone Bricks");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack", "Polished Netherrack");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack_stairs", "Polished Netherrack Stairs");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack_slab", "Polished Netherrack Slab");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack_wall", "Polished Netherrack Wall");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack_bricks", "Polished Netherrack Bricks");
        translationBuilder.add("item.minecraft-experienced.layered_polished_netherrack", "Layered Polished Netherrack");
        translationBuilder.add("item.minecraft-experienced.cut_polished_netherrack", "Cut Polished Netherrack");
        translationBuilder.add("item.minecraft-experienced.polished_netherrack_pillar", "Polished Netherrack Pillar");
        translationBuilder.add("item.minecraft-experienced.polished_andesite_wall", "Polished Andesite Wall");
        translationBuilder.add("item.minecraft-experienced.cracked_polished_andesite", "Cracked Polished Andesite");
        translationBuilder.add("item.minecraft-experienced.polished_granite_wall", "Polished Granite Wall");
        translationBuilder.add("item.minecraft-experienced.cracked_polished_granite", "Cracked Polished Granite");
        translationBuilder.add("item.minecraft-experienced.polished_diorite_wall", "Polished Diorite Wall");
        translationBuilder.add("item.minecraft-experienced.cracked_polished_diorite", "Cracked Polished Diorite");
    }
}
