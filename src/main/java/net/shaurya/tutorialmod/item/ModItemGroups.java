package net.shaurya.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.shaurya.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(Items.DIAMOND);
                        entries.add(Items.NETHERITE_HELMET);
                        entries.add(Items.NETHERITE_CHESTPLATE);
                        entries.add(Items.NETHERITE_LEGGINGS);
                        entries.add(Items.NETHERITE_BOOTS);
                        entries.add(Items.NETHERITE_SWORD);
                        entries.add(Items.NETHERITE_PICKAXE);
                        entries.add(Items.NETHERITE_AXE);
                        entries.add(Items.NETHERITE_SHOVEL);
                        entries.add(Items.NETHERITE_INGOT);


                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}