package io.github.lordjirix.thefmb;

import com.mojang.logging.LogUtils;
import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Thefmb.MODID)
public class Thefmb {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "thefmb";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "thefmb" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "thefmb" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "thefmb" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);






    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THEFMB_TAB = CREATIVE_MODE_TABS.register("thefmb_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.thefmb")).withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS).icon(() -> FMBlocks.BLUID_4_BLOCK_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(FMBlocks.TFMB_BLOCK.get());
        // Bluids
        output.accept(FMBlocks.BLUID_0_BLOCK.get());
        output.accept(FMBlocks.BLUID_1_BLOCK.get());
        output.accept(FMBlocks.BLUID_2_BLOCK.get());
        output.accept(FMBlocks.BLUID_3_BLOCK.get());
        output.accept(FMBlocks.BLUID_4_BLOCK.get());
        output.accept(FMBlocks.BLUID_5_BLOCK.get());
        // Yellids
        output.accept(FMBlocks.YELLID_0_BLOCK.get());
        output.accept(FMBlocks.YELLID_1_BLOCK.get());
        output.accept(FMBlocks.YELLID_2_BLOCK.get());
        output.accept(FMBlocks.YELLID_3_BLOCK.get());
        output.accept(FMBlocks.YELLID_4_BLOCK.get());
        output.accept(FMBlocks.YELLID_5_BLOCK.get());
        // Ruids
        output.accept(FMBlocks.RUID_0_BLOCK.get());
        output.accept(FMBlocks.RUID_1_BLOCK.get());
        output.accept(FMBlocks.RUID_2_BLOCK.get());
        output.accept(FMBlocks.RUID_3_BLOCK.get());
        output.accept(FMBlocks.RUID_4_BLOCK.get());
        output.accept(FMBlocks.RUID_5_BLOCK.get());
        // Grenids
        output.accept(FMBlocks.GRENID_0_BLOCK.get());
        output.accept(FMBlocks.GRENID_1_BLOCK.get());
        output.accept(FMBlocks.GRENID_2_BLOCK.get());
        output.accept(FMBlocks.GRENID_3_BLOCK.get());
        output.accept(FMBlocks.GRENID_4_BLOCK.get());
        output.accept(FMBlocks.GRENID_5_BLOCK.get());

    }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Thefmb(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        FMBlocks.init(modEventBus);
        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (Thefmb) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);



        // Register our mod's ModConfigSpec so that FML can create and load the config file for us

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("Few more block");


    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {


        }
    }
}
